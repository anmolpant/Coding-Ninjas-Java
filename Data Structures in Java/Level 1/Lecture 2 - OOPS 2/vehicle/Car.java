package vehicle;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
