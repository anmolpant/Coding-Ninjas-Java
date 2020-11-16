
public class Lec8_ArrangeNumbersInArray {
	public static void arrange(int[] arr, int n) {
    	//Your code goes here
        
        int len = arr.length;
        int val1 = 1;
        int mod = len%2;
        int val2 =  n - mod;
        if (mod == 0){
            val2=val2-2;
        }
        
        for(int i =0; i<len; i++){
            if (i<n/2){
                arr[i] = val1;
                val1 = val1+2;
            }
            
            if (i==n/2){
                arr[i] = len;
            }
            
            if (i>n/2){
                arr[i] = val2;
                val2 = val2-2;
            }
        }
        //System.out.println(arr);
//         for (int i = 0; i < len; i++){
//             if (n%2!=0){
//                 arr[0] = 1;
//                 arr[((n/2))] = n;
                
//                 for (int j=1; j<n/2;j=j+2){
//                     arr[j] = j;
//                 }
                
//                 for (int k =n-1; k>n/2; k--){
//                     arr[k] = k-2;
//                     k--;
//                 }
//             }
            
// //             if (n%2==0){
                
// //             }
//         }
    }
    
}
