
public class Recursion_AllIndexesOfANumber {
    
    public static int[] indexBtao(int input[], int x, int startIndex){
        
        //if startindex reaches the end return empty array.
        if(startIndex == input.length){
            int[] ans = new int[0];
            return ans;
        }
        
        //recursion  baazi
        
        int[] smallAns = indexBtao(input,x, startIndex+1);
        
        //if the number is found at startIndex
        
        if (input[startIndex] == x){
            
            int[] ans = new int[smallAns.length +1];
            //return startIndex;
        
        
        //shift elements to accomodate the starting index
        ans[0] = startIndex;
        
        for(int i = 0; i<smallAns.length; i++){
            ans[i+1] = smallAns[i];
        }
        return ans;
        
        }else{
            return smallAns;
        }
        
    }

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        
        return indexBtao(input,x,0);
		
	}
    
}
