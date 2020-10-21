import java.util.Scanner;
public class Lec6_DecimalToBinary {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //System.out.println(Integer.toBinaryString(n));
        
        
        //logic
        
        int pos = 1;
        int sum = 0;
        int temp = n;
        
        while (n!=0){
            
            temp=n%2;
            sum = sum + (temp*pos);
            pos = pos*10;
            n=n/2;
        }
        
        System.out.println(sum);

	}
}

