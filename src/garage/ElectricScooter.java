package garage;

public class ElectricScooter extends Vehicle {

	private boolean battery;

	public ElectricScooter(int id, String make, int wheels, int doors, double engine, String colour, boolean battery) {
		super(id, make, wheels, doors, engine, colour);
		this.battery = battery;
	}

	public String chargeBattery() {
		return "Battery Charging!";
	}

	public boolean hasBattery() {
		return this.battery;
	}

	@Override
	public String move() {
		return "Electric Scooter is moving!";
	}

	@Override
	public String brake() {
		return "Electric Scooter is braking!";
	}

	@Override
	public String accelerate(int mph) {
		return "Electric Scooter is accelerating by " + mph + "mph";
	}

}
