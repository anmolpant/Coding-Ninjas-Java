import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n%2==0) {
			System.out.println("Even");
			//return;
		} else {
			System.out.println("Odd");
		}
		
		//return helps us escape out of the statement

	}

}
