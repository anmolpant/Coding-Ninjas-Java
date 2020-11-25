
public class Recursion_RemoveDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        
        int len = s.length();
        String ans = "";
        
        if(len==1){
            return s;
        }
        
        // if(s.charAt(0)==s.charAt(1)){
        //     ans = s.charAt(1) + removeConsecutiveDuplicates(s.substring(2,len));
        //     return ans;
        // }
        
                
        if(s.charAt(0)!=s.charAt(1)){
            ans = ans + s.charAt(0);
            //return ans;
        }
        
        
            String Smallans = removeConsecutiveDuplicates(s.substring(1,len));
            return ans + Smallans;

	}

}
