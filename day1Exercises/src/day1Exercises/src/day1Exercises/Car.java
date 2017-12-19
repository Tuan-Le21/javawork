package day1Exercises.src.day1Exercises;

public class Car extends Vehicle {
	int bootSize;

	public Car(String vehicleID, String vehicleType, String engine, String make, String color, String model,
			int bootSize, String price) {
		super(vehicleID, vehicleType, engine, make, color, model, price);
		this.bootSize = bootSize;
	}

}
