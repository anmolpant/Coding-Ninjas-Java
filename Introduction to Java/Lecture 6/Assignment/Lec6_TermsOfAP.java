import java.util.Scanner;
public class Lec6_TermsOfAP {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int count = 1;
        for(int i=1; count<=n;i++){
            int ans = ((3*i)+2);
            if (ans%4!=0){
                System.out.print(ans + " ");
                count++;
            }
        }

	}
}


