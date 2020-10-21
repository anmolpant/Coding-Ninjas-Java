import java.util.Scanner;
public class Lec6_SumOrProduct {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        
        if (c==1){
            int sum = 0;
            for(int i =1; i<=n; i++){
                sum+=i;
            }
            System.out.println(sum);
        }
        
        else if (c==2){
            int prod = 1;
            for (int j=1; j<=n; j++){
                prod*=j;
            }
            System.out.println(prod);
            
        }
        
        else{
            System.out.println(-1);
        }

	}
}


