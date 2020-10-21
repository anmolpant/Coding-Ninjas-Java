import java.util.Scanner;
public class Lec6_AllPrimeNumbers {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        boolean b = true;
        for (int i=2;i<=N;i++){
        		b=true;
                for (int j=2;j<i;j++)
                {   
                    if(i%j==0){
                    b=false;
                     break;
                    }
                }  
            if(b){
            	System.out.println(i);
            	}
        }
        

		
	}
}



