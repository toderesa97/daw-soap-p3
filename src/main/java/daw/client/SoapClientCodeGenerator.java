package daw.client;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class SoapClientCodeGenerator {

	public static void main(String[] args) {
		System.setProperty("javax.xml.accessExternalSchema", "all");
		WSDLToJava.main(new String[] {
			"-client",
			"-d","src/main/java",
			"classpath:youtubeService.wsdl"
		});
		System.out.println("done!");
	}
	
}