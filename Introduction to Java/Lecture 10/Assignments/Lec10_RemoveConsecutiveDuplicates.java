
public class Lec10_RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String x = "";
        int temp = Integer.MIN_VALUE;
//         String temp = "";
          int len = str.length();
//         x = x + str.charAt(0);
//         for(int i = 1; i<len; i++){
//             int xlen = x.length();
//             for(int j = i-1; j<xlen; j++){
//                 if(x.charAt(j) != str.charAt(i)){
//                     x = x+str.charAt(i);
//                 }
//             }
            
//         }

//         return x;
        
        for(int i = 0; i<len; i++){
            if (temp!=(int)str.charAt(i)){
                x = x+str.charAt(i);
                temp = (int)str.charAt(i);
            }
        }
        
        return x;
	}


}
