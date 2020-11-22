
public class Recursion_SumOfArray {
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        
        int len = input.length;
        
        if (len==1){
            return input[0];
        }
        
        int smallInput[] = new int[len-1];
        for(int i = 0; i<len-1; i++){
            smallInput[i] =input[i];
        }
        
        return sum(smallInput) + input[len-1];
		
	}

}
