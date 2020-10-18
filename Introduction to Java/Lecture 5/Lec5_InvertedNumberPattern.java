import java.util.Scanner;
public class Lec5_InvertedNumberPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i =1;
        while (i<=n){
            int j = 1;
            while (j<=(n-i+1)){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
