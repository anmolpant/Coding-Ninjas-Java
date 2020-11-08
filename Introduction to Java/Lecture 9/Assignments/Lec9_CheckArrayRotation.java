public class Lec9_CheckArrayRotation {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        
        //the no of times the array has been rotated = the index of the minimum element in the rotated array
        
        int len = arr.length;
        int min_element = Integer.MAX_VALUE;
        int min_index = Integer.MAX_VALUE;
        
        if (len==0){
            return 0;
        }
        
        for(int i = 0; i< len; i++){
            if (arr[i]<min_element){
                min_element = arr[i];
                min_index = i;
            }
        }
        
        return min_index;
    }

}

