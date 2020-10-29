public class Lec8_ArrayIntersection{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    //update the jth element in second array w dummy value so as to prevent comparison if they are the same.
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        
    }
}
