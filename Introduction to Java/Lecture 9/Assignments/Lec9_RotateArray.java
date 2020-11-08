public class Lec9_RotateArray {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
        int len = arr.length;
        int[] temp = new int[d];
        
//         for (int i = 0; i<len; i++){
//             temp = arr[0];
//             for(int j = 0; j<d; j++){
//                 arr[j] = arr[j+1];
//                 arr[j] = temp;
            
//             }
//         }
        //copy first d elements into temp
        for (int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        
        for(int i =d; i<len; i++){
            arr[i-d] = arr[i];
        }
        
        int k = 0;
        
         for (int i = len-d; i < len; i++) { 
            arr[i] = temp[k];
            k++;
        } 
        
    }

}
