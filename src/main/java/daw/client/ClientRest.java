package daw.client;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import com.crossfit.youtube.QueryInvalidURL;
import com.crossfit.youtube.Youtube_YoutubeSOAP_Client;

import daw.exercise.Exercise;
import daw.token.Token;
import daw.training.Training;
import daw.user.Usuario;

public class ClientRest {

	private static String username;
	private static String password;
	private static String node;
	
	private static WebClient client;
	private static WebClient clientRest;
	private static Token token;
	private static Usuario user;
	
	public static void main(String[] args) {
		
		username = "test";
		password = "test";
		node = "node/7";
		
		clientRest = WebClient.create("http://localhost:4179/training/t/");
		
		
		client = WebClient.create("http://localhost/crossfit/rest");
		client.accept("application/xml");
		token = getTokenUsingPost();
		user = getUserUsingPost(username, password);
				
		// Función para actualizar el vídeo de youtube de un nodo (variable node).
		updateYoutubeVideo("https://www.youtube.com/watch?v=I7TzLNg8uFU");
		
		// Función para cambiar el título de un Training o Exercise.
		changeTitleFrom("training","Helen","Elena");

	}
	
	public static void updateYoutubeVideo(String url) {
		System.out.println("Current input: "    + getTraining(node).getFieldYoutube().getUnd().getItem().getInput());
		System.out.println("Current video_id: " + getTraining(node).getFieldYoutube().getUnd().getItem().getVideoId());
				
		try {
			String video_id = Youtube_YoutubeSOAP_Client.getVideoIdFrom(url);
			updateContent(node, "field_youtube[und][0][input]", url);
			updateContent(node, "field_youtube[und][0][video_id]", video_id);
		} catch (QueryInvalidURL e) {
			e.printStackTrace();
		}
		
		System.out.println("New input: "    + getTraining(node).getFieldYoutube().getUnd().getItem().getInput());
		System.out.println("New video_id: " + getTraining(node).getFieldYoutube().getUnd().getItem().getVideoId());
	
	}

	public static void changeTitleFrom(String contentType, String currentTitle, String newTitle) {
		// Llamada a servidor Rest:
		String currentTitleNodeId = getNodeIdFrom(currentTitle);
		if (currentTitleNodeId.equals("-1")) return;
		
		System.out.println("CurrentTitleNodeId " + currentTitle + " " + currentTitleNodeId );
		
		if(contentType.equals("exercise")) {
			getExercise("node/" + currentTitleNodeId).getTitle();
		} else if (contentType.equals("training")) {
			getTraining("node/" + currentTitleNodeId).getTitle();
		}
		
		updateContent("node/"+ currentTitleNodeId, "title", newTitle);
		
		// Llamada a servidor Rest:
		String newTitleNodeId = getNodeIdFrom(newTitle);
		if (newTitleNodeId.equals("-1")) return;
		
		System.out.println("newTitleNodeId " + newTitle + " " + newTitleNodeId );
	
		if(contentType.equals("exercise")) {
			getExercise("node/" + newTitleNodeId).getTitle();
		} else if (contentType.equals("training")) {
			getTraining("node/" + newTitleNodeId).getTitle();
		}
	}
	
	public static Exercise getExercise(String path){
		client.back(true);
		client.accept("application/xml");
		client.path(path);
		return client.get(Exercise.class);
	}
	
	public static Training getTraining(String path) {
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
	
	public static String getNodeIdFrom(String name) {
		clientRest.back(true);
		clientRest.accept("*/*");
		clientRest.path(name);
		return clientRest.get(java.lang.String.class);
	}
	
}
