public class Lec9_Sort012 {

    public static void sort012(int[] arr){
    	//Your code goes here
        
        int count0 = 0, count1 = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            
            else if (arr[i] == 1){
                count1++;
            }
        }
        
        for(int i = 0; i<count0; i++){
            arr[i] = 0;
        }
        
        for(int i = count0; i<count0+count1; i++){
            arr[i] = 1;
        }
        
        for(int i = count0+count1; i<arr.length; i++){
            arr[i] = 2;
        }
        
//         int nz = 0;
//         int nt = arr.length-1;
//         int len = arr.length;
//         int temp = 0;
//         int k = 0;
        
//         for(int i = 0; i<len; i++){
//             if (arr[i] ==0){
//                 //swap with nz
                
//                 temp = arr[nz];
//                 arr[nz] = arr[i];
//                 arr[i] = temp;
//                 nz++;
//             }
            
//             if (arr[k] ==2){
//                 //swap w nt
//                 temp = arr[nt];
//                 arr[nt] = arr[k];
//                 arr[k] = temp;
//                 nt--;
//                 i--;
            
//         }
//     }
        
//         for (int j = nz; j<(nt-nz); j++){
//             arr[j] = 1;
//         }
    }

}
