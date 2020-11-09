
public class Lec10_CheckPalindrome {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        
//         String str2 = ""
        
        int len = str.length();
        int i = 0;
        int j = len-1;
//         for(int i = len-1; i>=0; i--){
//             str2.charAt(k) = (str.charAt(i));
//         }
        
//         return true;
        
//         for(int i = 0; i<len; i++){
//             for (int j = len-1; j>=0; j--){
//                 if (str.charAt(i) == str.charAt(j)){
//                     return true;
//                 }
//             }                
//         }
        
//         return false;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        
         return true;
	}
   

}
