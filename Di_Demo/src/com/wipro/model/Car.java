package com.wipro.model;

/*
* Car has-a Engine.
*
* Her Car is dependent and Engine is dependency
*
* How to inject dependency (Engine object) into dependent(Car object) ?
*/


public class Car {
	
	private String brand;
	private String model;
	private Engine engine;
	
	public Car() {
		
	}
	
	//constructor injection
	public Car(String brand, String model, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}
	
	//setter injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
	
}
