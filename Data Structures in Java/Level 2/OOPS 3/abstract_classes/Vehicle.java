package abstract_classes;

public abstract class Vehicle {
	protected String color;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle Constructor");
	}
	
//	public Vehicle() {
//		System.out.println("Vehicle Constructor");
//	}
	
	public abstract boolean isMotorized();
	
	public abstract String getCompany();
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
}
