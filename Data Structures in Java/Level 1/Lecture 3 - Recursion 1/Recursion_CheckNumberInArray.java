
public class Recursion_CheckNumberInArray {
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        int len = input.length;
        
        if(len<=0){
            return false;
        }
        
        int[] smallInput = new int[len-1];
        for(int i = 1; i<len-1; i++){
            smallInput[i-1] = input[i];
        }
        
        boolean smallAns = checkNumber(smallInput, x);
        
        if (smallAns){
            return true;
        }
        
        if (input[0] == x){
            return true;
        } else{
            return false;
        }
		
	}

}
