
public class Recursion2_PrintAllCodesString {
	
	   private static void printAllPossibleCodes(String input, String output){
	        
	        int len = input.length();
	        if (len==0){
	            System.out.println(output);
	            return;
	        }
	        
	        char firstChar = (char)((input.charAt(0)-'0'+'a'-1));
	        printAllPossibleCodes(input.substring(1), output + firstChar);
	        
	        if (input.length()>=2){
	            char firstTwoChar = (char)((input.charAt(0)-'0')*10 + (input.charAt(1)-'0')+'a'-1);
	            
	            if (firstTwoChar>='a' && firstTwoChar <='z'){
	                printAllPossibleCodes(input.substring(2), output + firstTwoChar);
	            }
	        }
	        
	        
	        // printAllPossibleCodes(input.substring(1), output);
	        // printAllPossibleCodes(input.substring(1),output + input.charAt(0));
	    }
	  

		public static void printAllPossibleCodes(String input) {
			// Write your code here
	        
	        //int start = 0;
	        String output = "";
	        printAllPossibleCodes(input,output);

		}

}
