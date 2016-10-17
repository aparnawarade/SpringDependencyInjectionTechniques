package POJO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;


public class car {
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	private String name;
	private Engine engine;
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	Properties p;
	
	private ArrayList Fruits;
	private LinkedHashSet<String> crickters;
	private LinkedHashMap<String, String> countrycapital;
	
	
	
	
	public ArrayList getFruits() {
		return Fruits;
	}
	public void setFruits(ArrayList fruits) {
		Fruits = fruits;
	}
	public LinkedHashSet<String> getCrickters() {
		return crickters;
	}
	public void setCrickters(LinkedHashSet<String> crickters) {
		this.crickters = crickters;
	}
	public LinkedHashMap<String, String> getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(LinkedHashMap<String, String> countrycapital) {
		this.countrycapital = countrycapital;
	}
	public car()
	{
		System.out.println("Car constructor");
	}
	public void displayCar()
	{
		System.out.println(engine.getEngineNo()+"-----"+name);
		System.out.println("Fruits "+Fruits.get(0));
		System.out.println("Crickter"+crickters.size());
		System.out.println("country"+countrycapital.get("India"));
	}
}
