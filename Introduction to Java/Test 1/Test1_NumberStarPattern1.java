import java.util.Scanner;
public class Test1_NumberStarPattern1 {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 1; i<=n; i++){
            int j = n;
            while (j>=1){
                
                if (j==i){
                    System.out.print("*");
                    j--;
                }
                else{
                System.out.print(j);
                j--;
                }
            }
            System.out.println();
            
            
        }

	}
}

