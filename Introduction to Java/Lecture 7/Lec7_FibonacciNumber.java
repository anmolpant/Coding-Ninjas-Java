public class Lec7_FibonacciNumber {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int term1 = 0;
        int term2 = 1;
        
        int temp;
        
        if (n==0 || n==1){
            return true;
        }
        
        else{
            while(term1+term2<=n){
                temp = term1 + term2;
                term1 = term2;
                term2 = temp;
                
                if (temp==n){
                    return true;
                }
            }
            
        }
        return false;
        

	}
	

}

