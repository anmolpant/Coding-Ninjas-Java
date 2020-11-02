public class Lec9_Push0sToEnd {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        
        int len = arr.length;
        int i = 0 ;
        int k = 0;
        int temp = 0;
        
        for(i = 0; i<len; i++){
            if (arr[i]!=0){
                
                //swap elements
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }

}
