
public class Recursion2_ReturnAllCodesString {
	// Return a string array that contains all possible codes
		public static  String[] getCode(String input){
			// Write your code here
	        
	        
	        //base case uwu
	        if(input.length() == 0){
			String ans[] = {""};
			return ans;
			}
	        
	        //first character case
	        String[] smallAns1 = getCode(input.substring(1));
	        char firstChar = (char)((input.charAt(0) - '0' + 'a' - 1));
	        for (int i = 0; i<smallAns1.length; i++){
	            smallAns1[i] = firstChar + smallAns1[i];
	        }
	        
	        
	        //check validity of the first two characters
	        String[] smallAns2 = new String[0];
	        
	        if(input.length()>=2){
	            char firstTwoChar = (char)((input.charAt(0)-'0')*10 + (input.charAt(1)-'0') + 'a' -1);
	            if (firstTwoChar>= 'a' && firstTwoChar<='z'){
	                smallAns2 = getCode(input.substring(2));
	                for(int i = 0; i<smallAns2.length; i++){
	                    smallAns2[i] = firstTwoChar + smallAns2[i];
	                }
	            }
	        }
	        
	        //combine smallAns1 and SmallAns2
	        
	        String[] ans = new String[smallAns1.length + smallAns2.length];
	        
	        for(int i = 0; i<smallAns1.length; i++){
	            ans[i] = smallAns1[i];
	        }
	        
	        for(int i = smallAns1.length; i<ans.length; i++){
	            ans[i] = smallAns2[i-smallAns1.length];
	        }
	        
	       return ans; 
		}
	    

}
