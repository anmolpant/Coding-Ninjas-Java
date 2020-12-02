
public class Recursion2_ReturnPermutationsString {
	public static String[] permutationOfString(String input){
		// Write your code here
        
        //base case
        if (input.length()==0){
            String ans[] = {""};
            return ans;
        }
        
        //take first character and call recursion on the rest
        String smallAns[] = permutationOfString(input.substring(1));
        
        //create new answer array with required number of positions
        String ans[]  = new String[smallAns.length * input.length()];
        
        //add the first character at every position of the obtained permutations of the substring
        int k = 0;
        //loop over arrays
        for(int i = 0; i<smallAns.length;i++){
            //loop over strings
            for(int j = 0; j<input.length(); j++){
                //build each string as string = before + character + after
                ans[k] = smallAns[i].substring(0,j) + input.charAt(0) + smallAns[i].substring(j,smallAns[i].length());
                k++;
            }
        }
        
        return ans;
		
	}

}
