package classes_and_objects;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1 = new Student();
		//Student s2 = new Student();
		
		Student s1 = new Student("Anmol", 283);
		Student s2 = new Student("Ayushi", 333);
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.getRollNumber());

//		s1.name = "Anmol";
//		s1.setRollnumber(283);
//		
//		s2.name = "Ayushi";
//		s2.setRollnumber(333);
		//s2.rollNumber = 333;
		s1.print();
		s2.print();
		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.getRollNumber());

	}

}
