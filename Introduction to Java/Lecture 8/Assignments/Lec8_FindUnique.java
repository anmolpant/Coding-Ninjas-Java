public class Lec8_FindUnique{  

    public static int findUnique(int[] arr){
		//Your code goes here
        
        int len = arr.length;
        
        int num = 0;
        boolean seen;
        
        for (int i = 0; i<len; i++){
           	seen = false;
            
            
            int thisInt = arr[i];
            
            for (int j = 0; j<len; j++){
                
                if (i==j){
                    continue;
                }
                
                else if(thisInt==arr[j]){
                    seen = true;
                    break;
                }
                
            }
            
            if (seen == false){
                num = arr[i];
            }
            
        }
        
        return num;
        
    }
}
