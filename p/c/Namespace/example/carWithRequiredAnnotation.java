package p.c.Namespace.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;


public class carWithRequiredAnnotation {
	private String name;
	private Engine2DIbyconstructur engine;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setEngine(Engine2DIbyconstructur engine) {
		this.engine = engine;
	}	
	public carWithRequiredAnnotation()
	{
		System.out.println("Car constructor");
	}
	public void displayCar()
	{
		System.out.println(engine.getEngineNo()+"-----"+name);;
	}
}
