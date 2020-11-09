public class Lec10_ReverseStringWordWise {
	public static String reverseWordWise(String input) {
		// Write your code here
        
//         int len = input.length();
        
//         for(int i = 0; i<len;i++){
//             if(input.charAt(i) == ' '){
                
//             }
//         }
        
        String x = "";
        int space = input.length();
        //System.out.println(space);
        for(int i = input.length()-1; i>=0;i--){
            if (i==0){
                x = x+input.substring(0,space);
            }
            
            else if(input.charAt(i)== ' '){
                x = x+input.substring(i+1,space)+" ";
                space = i;
            }
        }
        
        return x;

	}
}

