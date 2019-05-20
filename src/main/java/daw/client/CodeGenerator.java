package daw.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.tools.xjc.XJCFacade;

import daw.client.CodeGenerator;

public class CodeGenerator {

	public static void main(String[] args) throws Throwable {
		final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);
		System.setProperty("javax.xml.accessExternalSchema", "all");
		XJCFacade.main(new String[]{
				"-b", "src/main/resources/binding-training.xml",
				"-d", "src/main/java",
				"-p", "daw.training",
				"src/main/resources/training.xsd"
		});
		System.out.println("Done! ;)");
	}
}
