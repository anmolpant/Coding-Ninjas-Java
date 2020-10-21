import java.util.Scanner;
import java.lang.Math;
public class Lec6_ReverseOfNumber {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp =0;
        int y;
        
        while(true)
        {
            if (n==0){
                break;
            }
            else{
            temp = temp*10; 
        	y = n%10;
            temp+=y;
        	
        	n=n/10;
        	}
            
        }
        System.out.print(temp);

	}
    
    
}


