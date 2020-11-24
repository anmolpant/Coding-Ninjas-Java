
public class Recursion_CheckPalindrome {
    
    public static boolean indexBtao(String input, int startIndex, int endIndex){
        
        
        int len = input.length();
        
        if(startIndex == endIndex){
            return true;
        }
        
        if (input.charAt(startIndex)!=input.charAt(endIndex)){
            return false;
        }
        
        if (startIndex<endIndex+1){
            return indexBtao(input,startIndex+1,endIndex-1);
            //return true;
            //return jawaab;
        }
        
        return true;
    }

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        int len = input.length();
        
        if(len==0){
            return true;
        }
        
        boolean ans = indexBtao(input,0, input.length()-1);
        return ans;
        
        

	}

}
