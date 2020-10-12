import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
        
        char grade=sc.next().charAt(0);

        
        double total_salary = 0;
        int allow;
        double hra =  (0.2d) * basic;
        double da = (0.5d) * basic;
        double pf =  (0.11d) * basic;
        
        if (grade == 'A'){
            allow = 1700;
            total_salary = (basic + hra + da + allow) - pf;
        }
        
         else if (grade == 'B'){
            allow = 1500;
            total_salary = (basic + hra + da + allow) - pf;
        }
        else {
            allow = 1300;
            total_salary = (basic + hra + da + allow) - pf;
        }
        
        System.out.println(Math.round(total_salary));

	}
}
