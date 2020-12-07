package final_keyword;

public class Car extends Vehicle{
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void printCar() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
