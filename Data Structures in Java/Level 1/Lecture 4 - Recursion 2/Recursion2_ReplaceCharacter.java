
public class Recursion2_ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        int len = input.length();
        String ans = "";
        
        if (len==0){
            return input;
        }
        
        if(input.charAt(0) == c1){
            ans = c2 + replaceCharacter(input.substring(1,len), c1, c2); 
            return ans;
        }
        
        else{
            ans = input.charAt(0) + replaceCharacter(input.substring(1,len), c1, c2);
            return ans;
        }

	}

}
