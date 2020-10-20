import java.util.Scanner;
public class Lec6_NthFiboNumber {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        
        int prevTerm=0, currentTerm = 1;
            for (int i=1; i<=n-1; i++){
                int newTerm = currentTerm + prevTerm;
                prevTerm = currentTerm;
                currentTerm = newTerm;
            }
            
        	System.out.println(currentTerm);
            

		
	}

}


