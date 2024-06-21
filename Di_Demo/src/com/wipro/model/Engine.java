package com.wipro.model;

public class Engine {
	private Long serialNumber;
	private Double capacity;
	private String type;
	
	
	public Engine() {
		
	}

	public Engine(Long serialNumber, Double capacity, String type) {
		super();
		this.serialNumber = serialNumber;
		this.capacity = capacity;
		this.type = type;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [serialNumber=" + serialNumber + ", capacity=" + capacity + ", type=" + type + "]";
	}
	
	

}
