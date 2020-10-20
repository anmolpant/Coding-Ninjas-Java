import java.util.Scanner;
public class SumTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		int sum = 0;
		
		for(i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		

	}

}
