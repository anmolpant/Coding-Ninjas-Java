public class Lec10_CheckPermutation {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        
        int  len1 = str1.length();
        int len2 = str2.length();
        
        int[] freq = new int[255];
        
        if(len1!=len2){
            return false;
        }
        
        if (len1 == len2){
            for(int i = 0; i<len1; i++){
                int var = (int)str1.charAt(i);
                freq[var]++;
                //System.out.println(var);
                
            }
                
                for(int j = 0; j<len2; j++){
                    int var = (int)str2.charAt(j);
                    
                    if (freq[var]!=0){
                        freq[var]--;
                    }else{
                        return false;
                    }
                    
                }
        }
        
        return true;
        
	}

}

