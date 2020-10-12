import java.util.Scanner;
import java.lang.Math;

public class PowOfNum {
    
    public static void main(String[] args) {
        // Write your code here
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		int n = sc.nextInt();
        
        float ans = (int)(Math.pow(x,n));
        
        System.out.println(Math.round(ans));
        
        
    }
}

