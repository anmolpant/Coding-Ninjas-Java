import java.util.Scanner;

public class PrintOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while (i<=n) {
			System.out.println(i);
			i = i + 1;
		}
		

	}

}
