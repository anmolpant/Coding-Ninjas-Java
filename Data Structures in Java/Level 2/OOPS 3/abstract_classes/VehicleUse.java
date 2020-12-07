package abstract_classes;

import java.util.Scanner;

public class VehicleUse {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle(20);
		Vehicle v = new Car(1,2);
		
//		v.color = "Black";
//		v.setMaxSpeed(10);
		//v.print();
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	
		if (n == 0) {
			v = new Car(10,20);
		} else {
			//v = new Vehicle(20);
		}
		//v.isConvertible();
		//v.print();
		
//		Car c = new Car(10,20);
//		c.color = "Black";
//		c.setMaxSpeed(100);
		//c.print();
	}

}
