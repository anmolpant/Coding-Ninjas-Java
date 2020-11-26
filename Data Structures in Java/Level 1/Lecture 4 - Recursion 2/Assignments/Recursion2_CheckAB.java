
public class Recursion2_CheckAB {
	public static boolean checkAB(String input) {
		// Write your code here
        
        int len = input.length();
        
        if(len==0){
            return true;
        }
        
        // if(input.charAt(0)=='a' && (input.charAt(1)=='a' || (input.charAt(1)=='b' && input.charAt(2)=='b'))){
        // if(input.charAt(0)=='a'){
        //     boolean ans = checkAB(input.substring(1,len));
        //     return ans;
        // }
        // else{
        //     return false;
        // }
        
        boolean smallAns = false;
        
        //take all cases one by one
        if(len==1){
            if(input.charAt(0)=='a'){
                smallAns = true;
                input = input.substring(1,len);
            }
            
        }
        else if(len==2){
            if(input.charAt(0) =='a' && input.charAt(1)=='a'){
                smallAns = true;
                input = input.substring(2,len);
            }
        }
        else if (len>=3){
            if(input.charAt(0)=='a' && input.substring(1,3).equals("bb")){
                smallAns = true;
                input = input.substring(3,len);
            }
            
            else if(input.charAt(0)=='a' && input.charAt(1)=='a'){
                smallAns = true;
                input = input.substring(1,len);
            }
        }
        
        return smallAns && checkAB(input);

	}

}
