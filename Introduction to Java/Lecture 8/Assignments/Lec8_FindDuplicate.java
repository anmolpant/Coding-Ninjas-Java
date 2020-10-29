public class Lec8_FindDuplicate{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
    	
    	//does not pass one particular test case, 
    	//will be debugged and updated asap
        
        int len = arr.length;
        boolean seen;
        int num=0;
        
        for(int i = 0; i<len; i++){
            num=0;
            seen = false;
            
            for (int j = 0; j<len; j++){
                if (i==j){
                    continue;
                }
                
                if (arr[i]==arr[j]){
                    seen = true;
                    break;
                }
            }
            
            if (seen = true){
                num = arr[i];
            }
            
            
            
        }
        
        return num;
    }
}

