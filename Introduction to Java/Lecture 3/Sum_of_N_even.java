import java.util.Scanner;
public class Sum_of_N_even{


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int sum = 0;
        int i = 1;
        
        while (i <= n){
            if (i%2==0){
                sum = sum + i;
              
            }
            i = i+1;
        }

		System.out.println(sum);
	}

}