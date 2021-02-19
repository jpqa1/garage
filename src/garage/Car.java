package garage;

public class Car extends Vehicle {

	public boolean spareTyre;

	public Car(int id, String make, int wheels, int doors, double engine, String colour, boolean spareTyre) {
		super(id, make, wheels, doors, engine, colour);
		this.spareTyre = spareTyre;
	}

	@Override
	public String move() {
		return "Car is moving!";
	}

	@Override
	public String brake() {
		return "Car is braking!";
	}

	@Override
	public String accelerate(int mph) {
		return "Car is accelerating by " + mph + "mph";
	}

}
