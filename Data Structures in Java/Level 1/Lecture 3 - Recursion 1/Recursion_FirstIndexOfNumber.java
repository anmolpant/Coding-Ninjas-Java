
public class Recursion_FirstIndexOfNumber {
	    public static int indexBtao(int input[], int x, int startIndex){
	        int len = input.length;
	        
	        
	        if (startIndex==len-1){
	            return -1;
	        }
	        
	        if (input[startIndex] == x){
	            return startIndex;
	        }
	        
	        int jawaab = indexBtao(input, x, startIndex+1);
	        
	        return jawaab;
	        
	    }
	    
	    
		public static int firstIndex(int input[], int x) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
	        

	        
	        
//	         int[] smallInput = new int[len-1];
//	         for(int i = 1; i<len-1; i++){
//	             smallInput[i-1] = input[i]; 
//	         }
	        
//	         int ans = firstIndex(smallInput, x);
	        
//	         if (input[0] == x){
//	             return 0;
//	         }else{
	        
//	         return ans;
//	         }
	        
	        int ans = indexBtao(input,x,0);
	        return ans;
	        
			
		}
}
