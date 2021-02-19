package garage;

public class Runner {

	public static void main(String[] args) {

		Garage theGarage = new Garage();

		Car bmw = new Car(0, "BMW", 4, 4, 1.8, "Gray", true);
		Bike harley = new Bike(1, "Harley Davidson", 2, 0, 1.2, "blue", true);
		ElectricScooter elecScoot = new ElectricScooter(2, "ElectroScoot", 2, 0, .5, "red", false);

		theGarage.addVehicle(bmw);
		theGarage.addVehicle(harley);
		theGarage.addVehicle(elecScoot);
		System.out.println("");

		// theGarage.viewVehiclesInGarage();

		theGarage.fixAllVehiclesInGarage();

		// theGarage.removeVehicle(1);

	}

}
