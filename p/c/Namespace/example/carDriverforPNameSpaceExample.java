package p.c.Namespace.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDriverforPNameSpaceExample {

	public static void main(String[] args) {
	
		String[] files= new String[]{"p/c/Namespace/example/PnameSpaceFile.xml"};
		ApplicationContext ap= new ClassPathXmlApplicationContext(files);
		carWithRequiredAnnotation c= (carWithRequiredAnnotation) ap.getBean("c");
		c.displayCar();
	} 

}
