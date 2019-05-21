package daw.client;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import com.ttdev.ss.SimpleService_P1_Client;

import daw.token.Token;
import daw.training.Training;
import daw.user.Usuario;

public class ClientRest {

	private static String username;
	private static String password;
	private static String node;
	
	private static WebClient client; 
	private static Token token;
	private static Usuario user;
	
	public static void main(String[] args) {
		
		username = "test";
		password = "test";
		node = "node/7";
		
		client = WebClient.create("http://localhost/crossfit/rest");
		client.accept("application/xml");
		token = getTokenUsingPost();
		user = getUserUsingPost(username, password);
		
		//getRequest("node/7").getFieldTrainingTypes().getUnd().getItem().forEach((exerciseItem) -> System.out.println(exerciseItem.getTargetId()));
		
		updateYoutubeVideo("https://www.youtube.com/watch?v=LlY90lG_Fuw");
	}
	
	public static void updateYoutubeVideo(String url) {
		System.out.println("Current input: "    + getRequest(node).getFieldYoutube().getUnd().getItem().getInput());
		System.out.println("Current video_id: " + getRequest(node).getFieldYoutube().getUnd().getItem().getVideoId());
				
		updateContent(node, "field_youtube[und][0][input]", url);
		String video_id = SimpleService_P1_Client.getVideoIdFrom(url);
		updateContent(node, "field_youtube[und][0][video_id]", video_id);
		
		System.out.println("New input: "    + getRequest(node).getFieldYoutube().getUnd().getItem().getInput());
		System.out.println("New video_id: " + getRequest(node).getFieldYoutube().getUnd().getItem().getVideoId());
	
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
	
	public static void updateContent(String path, String name, String value) {
		Form form = new Form();
		form.set(name, value);
		client.back(true);
		client.path(path);
		client.header("cookie", user.getSessionName() + "=" + user.getSessid());
		client.replaceHeader("X-CSRF-Token", user.getToken());
		client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form, String.class);
	}
	
}
