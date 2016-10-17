package POJO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;


public class car2 {
	private String name;
	private Engine2 engine;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setEngine(Engine2 engine) {
		this.engine = engine;
	}	
	public car2()
	{
		System.out.println("Car constructor");
	}
	public void displayCar()
	{
		System.out.println(engine.getEngineNo()+"-----"+name);;
	}
}
