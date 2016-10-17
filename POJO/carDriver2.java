package POJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDriver2 {

	public static void main(String[] args) {
	
		String[] files= new String[]{"POJO/PnameSpaceFile.xml"};
		ApplicationContext ap= new ClassPathXmlApplicationContext(files);
		car2 c= (car2) ap.getBean("c");
		c.displayCar();
	} 

}
