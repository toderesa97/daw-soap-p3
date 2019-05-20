package daw.client;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import daw.token.Token;
import daw.training.Training;
import daw.user.Usuario;

public class ClientRest {

	private static String username;
	private static String password;
	
	private static WebClient client; 
	private static Token token;
	private static Usuario user;
	
	public static void main(String[] args) {
		//form.set("body[und][0][value]","PRUEBA");
		client = WebClient.create("http://localhost/crossfit/rest");
		username = "test";
		password = "test";
		client.accept("application/xml");
		token = getTokenUsingPost();
		user = getUserUsingPost(username, password);
		System.out.println(getRequest("node/7").getBody().getUnd().getItem().getValue());
		System.out.println("SessionName: "+user.getSessionName());
		System.out.println("Sessid: "+user.getSessid());
		updateContent("body[und][0][value]", "PRUEBA 20052019", "node/7");
		System.out.println(getRequest("node/7").getBody().getUnd().getItem().getValue());
	}

	public static Training getRequest(String path) {
		client.back(true);
		client.accept("application/xml");
		client.path(path);
		return client.get(Training.class);
	}
	
	public static Token getTokenUsingPost() {
		client.path("user/token");
		return client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null, Token.class);
	}
	
	public static Usuario getUserUsingPost(String username, String password) {
		client.back(true);
		client.header("X-CSRF-Token", token.getToken());
		client.path("user/login");
		Form form = new Form();
		form.set("username", username);
		form.set("password", password);
		return client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, Usuario.class);
	}
	
	public static void updateContent(String name, String value, String path) {
		Form form = new Form();
		form.set(name, value);
		client.back(true);
		client.path(path);
		client.header("cookie", user.getSessionName() + "=" + user.getSessid());
		client.replaceHeader("X-CSRF-Token", user.getToken());
		client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form, String.class);
	}
	
}
