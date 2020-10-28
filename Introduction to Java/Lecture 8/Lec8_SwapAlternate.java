public class Lec8_SwapAlternate {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        
        int len = arr.length;
        int temp = 0;
        
        if (len%2==0)
        {
        
        	for (int i = 0; i< len; i=i+2){
            	temp = arr[i];
            	arr[i] = arr[i+1];
            	arr[i+1] = temp; 
        	}
        }
        
        else{
            for (int j = 0; j<len-1; j=j+2){
                temp = arr[j];
            	arr[j] = arr[j+1];
            	arr[j+1] = temp; 
            }
        }
        //System.out.println(arr);
    }
}

