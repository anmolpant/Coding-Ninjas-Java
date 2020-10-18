import java.util.Scanner;
public class Lec5_IsocelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while (i<=n) {
			int val =1;
			//spaces
			int j = 1;
				while (j<=n-i) {
					System.out.print(" ");
					j++;
				}
				//increasing numbers
				j=1;
				while (j<=i) {
					System.out.print(val);
					val++;
					j++;
			}
				//decreasing numbers
				j=1;
				while(j<=i-1) {
					System.out.print(val-2);
					val--;
					j++;
				}
			
			System.out.println();
			i++;
		}

	}

}
