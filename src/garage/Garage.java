package garage;

import java.util.ArrayList;

public class Garage {

	// create an array list of type vehicle
	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	// methods that add a Vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println(vehicle.getMake() + " added to garage!");
	}

	// method for iterating through the vehicle list
	public void viewVehiclesInGarage() {
		for (Vehicle vehicle : vehicleList) {
			vehicle.print();
			System.out.println("");
		}
	}

	// method remove vehicles from the list by ID
	public void removeVehicle(int id) {
		System.out.println("--- Removing vehicle from garage ---");
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.getId() == id) {
				int idx = vehicleList.indexOf(vehicle);
				vehicleList.remove(idx);
				System.out.println(
						"Vehicle id: " + vehicle.getId() + " - " + vehicle.getMake() + " removed from garage.");
			}
		}
	}

	// method to fix all vehicles in garage and calculate bill
	public void fixAllVehiclesInGarage() {

		System.out.println("--- Fix All Vehicles In Garage ---");

		double carBill = 0;
		double bikeBill = 0;
		double scootBill = 0;

		for (Vehicle vehicle : vehicleList) {

			if (vehicle.getClass().getName() == "garage.Car") {
				System.out.println(
						"Fixing Car.....Looks like you need some new break pads in addition to the oil change");
				carBill += 100;
				System.out.println(vehicle.getMake() + " has been fixed, this will cost you £100.00");
				System.out.println("Bill so far: " + carBill);

			} else if (vehicle.getClass().getName() == "garage.Bike") {
				System.out.println("Fixing Bike.....");
				bikeBill += 50;
				System.out.println(vehicle.getMake() + " has been fixed, this will cost you £50.00");
				System.out.println("Bill so far: " + bikeBill);

			} else if (vehicle.getClass().getName() == "garage.ElectricScooter") {
				System.out.println("Fixing Scooter.....");
				scootBill += 25;
				System.out.println(vehicle.getMake() + " has been fixed, this will cost you £25.00");
				System.out.println("Bill so far: " + scootBill);
			}

		}

		System.out.println("");
		System.out.println("------BILL------");
		System.out.println("Car - Total Bill: " + "£" + carBill);
		System.out.println("Bike - Total Bill: " + "£" + bikeBill);
		System.out.println("Electric Scooter - Total Bill: " + "£" + scootBill);
		System.out.println("");

		System.out.println("---BILL PAID ---");
		carBill = 0;
		bikeBill = 0;
		scootBill = 0;

		System.out.println("Removing vehicles from garage!...");
		removeAllVehiclesFromGarage();

	}

	public void removeAllVehiclesFromGarage() {
		vehicleList.clear();
		System.out.println("All vehicles removed from Garage");
	}

}
