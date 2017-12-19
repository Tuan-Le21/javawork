package day1Exercises.src.day1Exercises;

public class Mainvehicle {

	public static void main(String[] args) {

		Garage VM = new Garage();

		Car veh1 = new Car("P57 8TY", "Car", "1.6", "Honda", "Red", "Civic Type R", 1500, " ");
		Car veh2 = new Car("Y62 4SW", "Car", "1.8", "Volkswagen", "Black", "Golf GTI", 1200, " ");
		Car veh3 = new Car("E17 6JR", "Car", "2.0", "Toyota", "Silver", "Yaris", 120, " ");
		Motorcycle veh4 = new Motorcycle("C58 7TY", "Motorcycle", "60cc", "Mitsubishi", "white", "blah", true, " ");
		Car veh5 = new Car("D68 2HG", "Car", "2.2", "Peugeot", "grey", "107", 30, " ");
		Truck veh6 = new Truck("W01 5TG", "Truck", "5.6", "Tesla", "White", "SUV", "10m", " ");

		VM.vehicleList.add(veh1);
		VM.vehicleList.add(veh2);
		VM.vehicleList.add(veh3);
		VM.vehicleList.add(veh4);
		VM.vehicleList.add(veh5);
		VM.vehicleList.add(veh6);

		VM.outputVMList();

		VM.billvehicle();
		System.out.println(VM);
	}
}
