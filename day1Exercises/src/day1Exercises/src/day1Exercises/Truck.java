package day1Exercises.src.day1Exercises;

public class Truck extends Vehicle {
	String carriageSize;

	public Truck(String vehicleID, String vehicleType, String engine, String make, String color, String model,
			String carriageSize, String price) {
		super(vehicleID, vehicleType, engine, make, color, model, price);
		this.carriageSize = carriageSize;

	}

}