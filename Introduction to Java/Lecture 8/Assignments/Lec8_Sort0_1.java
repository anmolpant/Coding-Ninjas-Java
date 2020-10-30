public class Lec8_Sort0_1 {  
    
    
    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        
        int len = arr.length;
        int count = 0;
       
        
        for(int i = 0; i<len; i++){
                count = count+ arr[i];
        }
        
        for (int i=0; i<(len-count); i++){
            arr[i] = 0;
        }
        
        for (int i = (len-count);i<len;i++){
            arr[i] = 1;
        }
    }
}

