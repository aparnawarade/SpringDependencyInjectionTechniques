package JAVABeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
	private Engine engine;

	public void printdata()
	{
		System.out.println("Engine Name is : "+engine.getEngineName());
	}
}
