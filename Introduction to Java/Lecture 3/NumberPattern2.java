import java.util.Scanner;
public class NumberPattern2 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int i = 1;
        int count;
        
        while (i <= n){
            int space = 1;
            while (space <=n - i){
                System.out.print(" ");
                space = space + 1;
            }
            int j = i;
            count = 0;
            while (count < i){
                System.out.print(j);
                count ++;
                j = j + 1;
            }
            i = i +1;
            System.out.println();
        }

		
	}

}