import java.util.Scanner;
public class Lec5_MirrorNumPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        while (i<=n){
            int val = 1;
            int j =1;
            while (j<=n-i){
                System.out.print(" ");
                j++;
            }
            
            j=1;
            while (j<=i){
                System.out.print(val);
                val++;
                j++;
                
            }
            
            System.out.println();
            i++;
        }
		
	}

}
