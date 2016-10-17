package POJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDriver {

	public static void main(String[] args) {
	
		String[] files= new String[]{"POJO/car.xml","POJO/engine.xml"};
		ApplicationContext ap= new ClassPathXmlApplicationContext(files);
		car c= (car) ap.getBean("car");
		c.displayCar();
	} 

}
