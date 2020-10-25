import java.util.Scanner;
public class Test1_Zeros_and_Stars_Pattern {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while (i<=n){
            
            int j = 1;
            while (j<=(2*n+1)){
                
                if (j==(((2*n)+2)/2)){
                    System.out.print('*');
                    j++;
                }
                
                else if (j==i){
                    System.out.print('*');
                    j++;
                }
                
                else if (j==((2*n+2)-i)){
                    System.out.print('*');
                    j++;
                }
                
                else{
                System.out.print(0);
                j++;
                }
            }
            System.out.println();
            i++;
            
        }
		
	}	


}


