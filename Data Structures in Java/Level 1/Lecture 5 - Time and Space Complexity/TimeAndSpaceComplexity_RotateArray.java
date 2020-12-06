
public class TimeAndSpaceComplexity_RotateArray {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
        int len = arr.length;
        int[] temp = new int[d];
        
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        
        for(int i = d; i<len; i++){
            arr[i-d] = arr[i];
        }
        
        int k = 0;
        
        for(int i = len-d; i<len; i++){
            arr[i] = temp[k];
            k++;
        }
        
        //return arr;
    }


}
