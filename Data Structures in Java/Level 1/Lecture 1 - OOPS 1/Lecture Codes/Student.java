package classes_and_objects;

public class Student {
	public String name;
	
	//final data members can be initialized as soon as they are declared
	private final int rollNumber;
	
	private static int numStudents;
	
//	public Student() {
//		rollNumber = 100;
//	}
	
//	public Student(String n) {
//		name = n;
//		rollNumber = 100;
//	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public Student(String name, int rollNumber) {
		//System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;
		numStudents++;
	}
	
//	public void setRollnumber(int rn) {
//		if(rn<=0) {
//			return;
//		}
//		rollNumber = rn;
//	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name + " : " + rollNumber);
	}
}


