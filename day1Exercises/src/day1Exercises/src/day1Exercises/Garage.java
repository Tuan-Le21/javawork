package day1Exercises.src.day1Exercises;

import java.util.ArrayList;

public class Garage {
	// addvehicles
	// removevehicles(By ID,By VehicleType)
	// fixvehicle(Calculate bill)
	// EmptyGarage <-- Remove the whole garage list

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void outputVMList() {
		for (Vehicle VM : vehicleList) {
			System.out.println(VM);

		}
	}

	public void billvehicle() {
		for (Vehicle VM : vehicleList) {
			if (VM instanceof Car) {
				VM.setPrice("£500");

			} else if (VM instanceof Motorcycle) {
				VM.setPrice("£350");

			} else if (VM instanceof Truck) {
				VM.setPrice("£750");

			}

		}
	}

	@Override
	public String toString() {
		return "Garage [vehicleList=" + vehicleList + "]";
	}

	public String removeFromVehicleList() {
		vehicleList.remove(vehicleList.indexOf(vehicleType));

	}

}
