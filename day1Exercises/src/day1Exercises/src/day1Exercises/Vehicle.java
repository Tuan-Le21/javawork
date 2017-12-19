package day1Exercises.src.day1Exercises;

public class Vehicle {

	private String vehicleID;
	private String vehicleType;
	private String engine;
	private String make;
	private String color;
	private String model;
	private String price;

	public Vehicle(String vehicleID, String vehicleType, String engine, String make, String color, String model,
			String price) {
		this.vehicleID = vehicleID;
		this.vehicleType = vehicleType;
		this.engine = engine;
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public void setVehicleID(String getVehicleID) {
		this.vehicleID = getVehicleID;
	}

	public void setVehicleType(String getVehicleType) {
		this.vehicleType = getVehicleType;
	}

	public void setEngine(String getEngine) {
		this.engine = getEngine;
	}

	public void setMake(String getMake) {
		this.make = getMake;
	}

	public void setModel(String getModel) {
		this.model = getModel;
	}

	public void setColor(String getColor) {
		this.color = getColor;
	}

	public void setPrice(String getPrice) {
		this.price = getPrice;
	}

	public String getVehicleID() {
		return vehicleID;

	}

	public String getVehicleType() {
		return vehicleType;

	}

	public String getEngine() {
		return engine;

	}

	public String getMake() {
		return make;

	}

	public String getModel() {
		return model;

	}

	public String getColor() {
		return color;

	}

	public String toString() {
		return "VehicleID: " + vehicleID + " Vehicle Type: " + vehicleType + " Engine: " + engine + " Make: " + make
				+ " Model: " + model + " Color: " + color + " Price: " + price;
	}
}
