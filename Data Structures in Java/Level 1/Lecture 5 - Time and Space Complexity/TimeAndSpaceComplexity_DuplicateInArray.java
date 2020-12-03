
public class TimeAndSpaceComplexity_DuplicateInArray {
	public static int findDuplicate(int[] arr) {
		//Your code goes here
        
//         int ans = 0;
        
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length;j++){
//                 if (arr[i]==arr[j]){
//                     // count++;
//                     // if (count>=2){
//                     ans = arr[j];
//                     //}
//                 }
//             }
//         }
        
//         return ans;
        
        int n = arr.length-2;
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        
        return (sum - ((n*(n+1))/2));
	}

}
