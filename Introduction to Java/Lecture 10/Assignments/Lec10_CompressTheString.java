
public class Lec10_CompressTheString {
public static String getCompressedString(String str) {
        
        //int count = 0;
        String x ="";
		//Your code goes here
        
//         int[] freq = new int[255];
//         String x = "";
        
//         for(int i = 0; i<str.length(); i++){
//             int count = (int)str.charAt(i);
//             freq[count]++;
//             x = x+str.charAt(i) + (freq[count]);
//         }
        
        
//         return x;
        int len = str.length();
        for(int i = 0; i<len; i++){
            
            int count = 1;
        
        while(i<len-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
            
            x+=str.charAt(i);
        
        if (count>1){
            x = x+count;
        }
        }
        
        return x;
}
}
