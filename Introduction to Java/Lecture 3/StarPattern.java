import java.util.Scanner;
public class StarPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int count = 1;
        int j;
        int space;
        
        while (i <= n){
            j = 1;
            space = (n-i);
            while (space>0){
                System.out.print(" ");
                space --;
            }
                
                while (j <=((2*i)-1)){
                    
                    System.out.print("*");
                    j = j+1;
                }
            System.out.println("");
            i = i + 1;
        }

	}
}
