import java.util.*;
import java.util.Arrays;  
public class Lec9_SecondLargestInArray {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        
        int len = arr.length;
        int first;
        int second;
        
        first = second = Integer.MIN_VALUE;
//         int temp = 0;
//         for(int i = 0; i< len; i++){
//             for (int j = i+1; j<len; j++){
//                 if (arr[i]>arr[j]){
//                     //swap
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
        
//         return arr[len - 2];
        
        for (int i = 0; i<len; i++){
            if (first<arr[i]){
                first = arr[i];
            }
        }
        
        for (int j = 0; j<len; j++){
            if (arr[j] != first){
                second = Math.max(second, arr[j]);
            }
        }
        
        return second;
    }
    
    

}
