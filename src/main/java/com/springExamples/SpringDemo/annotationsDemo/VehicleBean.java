package com.springExamples.SpringDemo.annotationsDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("carBean")
@Scope("prototype")
public class VehicleBean {
	
	@Value("Audi")
	private String brand;
	
	@Value("SUV")
	private String type;
	
	@Value("Q3")
	private String Id;
	
	@Value("#{sensorList}")
	private List<String> sensors;



	VehicleBean(String brand, String type, String id, List<String> sensors) {
		super();
		this.brand = brand;
		this.type = type;
		Id = id;
		this.sensors = sensors;
	}

	@Override
	public String toString() {
		return "VehicleBean [brand=" + brand + ", type=" + type + ", Id=" + Id + ", sensors=" + sensors + "]";
	}

	public List<String> getSensors() {
		return sensors;
	}

	public void setSensors(List<String> sensors) {
		this.sensors = sensors;
	}

	VehicleBean() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return Id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(String id) {
		Id = id;
	}

}
