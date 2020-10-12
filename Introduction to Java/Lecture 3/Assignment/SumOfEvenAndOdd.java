import java.util.Scanner;
public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int temp = n;
        int digit;
        int soe = 0;
        int soo = 0;
        
        while (temp>0){
            digit = temp % 10;
            temp = temp / 10;
            
            if (digit%2==0){
                soe = soe + digit;
            }
            else{
                soo = soo + digit;
            }
            }
        
        System.out.print(soe);
        System.out.print(" ");
        System.out.print(soo);
        
            
        }
        
        
    }

