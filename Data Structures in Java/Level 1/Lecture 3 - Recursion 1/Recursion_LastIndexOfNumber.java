
public class Recursion_LastIndexOfNumber {
    
    public static int indexBtao(int input[], int x, int startIndex){
        
        int len = input.length;
        
        if (startIndex == 0){
            return  -1;
        }
        
        if (input[startIndex] == x){
            return startIndex;
        }
        
        int jawaab = indexBtao(input, x, startIndex-1);
        
        return jawaab;
        
    }

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        int ans = indexBtao(input,x,input.length-1);
        
        return ans;
	}

}
