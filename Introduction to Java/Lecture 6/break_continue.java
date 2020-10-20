import java.util.Scanner;
public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int d = 2;
		boolean divided = false;
		while(d<n) {
			if (n%d ==0) {
				divided = true;
				break;
			}
			d++;
		}
		
		if (divided) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
