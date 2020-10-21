import java.util.Scanner;
import java.lang.Math;
public class Lec6_BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int decimal =0;
        int pow =0;
        
        while(true)
        {
            if (n==0){
                break;
            }
            else{
        	int temp = n%10;
        	decimal = decimal + temp*((int)Math.pow(2,pow));
        	n=n/10;
            pow++;
        	}
            
        }
        System.out.println(decimal);

	}
    
    
}


