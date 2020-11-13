
public class Test2_MinimumLengthWord {
public static String minLengthWord(String input){
		
		// Write your code here
        int len = input.length();
        int start = 0;
        int space = 0;
        int end = len;
        int minLength = Integer.MAX_VALUE;
        
        for(int i = 0; i<len; i++){
            
            if (i == len || input.charAt(i) == ' '){
                int length = i - space; 
                if (length<minLength){
                    minLength = length;
                    start = space;
                    end = i;
                }
                
                space = i+1;
            }
        }
        
        return(input.substring(start, end));
        
        
        
        
	}

}
