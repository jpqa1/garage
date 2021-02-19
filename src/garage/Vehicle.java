package garage;

public abstract class Vehicle {

	private int id;
	private String make;
	private int wheels;
	private int doors;
	private double engine;
	private String colour;

	public Vehicle(int id, String make, int wheels, int doors, double engine, String colour) {
		this.id = id;
		this.make = make;
		this.wheels = wheels;
		this.doors = doors;
		this.engine = engine;
		this.colour = colour;
	}

	public void print() {
		System.out.println("This vehicle is a " + this.make + ". It has " + this.wheels + " wheels, " + this.doors
				+ " doors, its engine size is " + this.engine + " and its colour is " + this.colour);
	}

	public int getId() {
		return id;
	}

	public String getMake() {
		return this.make;
	}

	public int getWheels() {
		return wheels;
	}

	public int getDoors() {
		return doors;
	}

	public double getEngine() {
		return engine;
	}

	public String getColour() {
		return colour;
	}

	public String move() {
		return "Vehicle is moving!";
	}

	public String brake() {
		return "Vehicle is braking!";
	}

	public String accelerate(int mph) {
		return "Vehicle is accelerating by " + mph + "mph";
	}

}
