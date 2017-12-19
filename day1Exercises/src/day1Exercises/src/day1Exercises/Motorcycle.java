package day1Exercises.src.day1Exercises;

public class Motorcycle extends Vehicle {
	Boolean boot;

	public Motorcycle(String vehicleID, String vehicleType, String engine, String make, String color, String model,
			Boolean boot, String price) {
		super(vehicleID, vehicleType, engine, make, color, model, price);
		this.boot = boot;

		// TODO Auto-generated constructor stub
	}

}
