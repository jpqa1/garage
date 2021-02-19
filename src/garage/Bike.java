package garage;

public class Bike extends Vehicle {

	private boolean helmet;

	public Bike(int id, String make, int wheels, int doors, double engine, String colour, boolean helmet) {
		super(id, make, wheels, doors, engine, colour);
		this.helmet = helmet;
	}

	@Override
	public String move() {
		return "Bike is moving!";
	}

	@Override
	public String brake() {
		return "Bike is braking!";
	}

	@Override
	public String accelerate(int mph) {
		return "Bike is accelerating by " + mph + "mph";
	}

	public boolean isHelmet() {
		return helmet;
	}

}
