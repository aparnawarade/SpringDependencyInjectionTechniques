package Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import JAVABeans.car;
/*
 * Applicable only for secondary type dependency
 */
public class carDriver {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("XMLBeans/XMLBean.xml");
		car c= (car)ap.getBean(car.class);
		c.printdata();
	}
}
