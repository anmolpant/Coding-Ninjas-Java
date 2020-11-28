
public class Recursion2_BinarySearch {
private static int search(int arr[], int start, int end, int target){
        
        
        
        int mid = (start+end)/2;
        
        
        if (start>=end){
            return -1;
        }
        
        if(target ==arr[mid]){
            return mid;
        }
        
        else if (target<arr[mid]){
            return search(arr,start, mid-1,target);
        }
        else{
            return search(arr,mid+1,end, target);
        }
        }

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
        
        int len = input.length;
        int end = len-1;
        int start = 0;
        
        return search(input, start, end, element);
        
        
//         if(len<=1){
//             return -1;
//         }
        
//         int smallAns[] = new int[len-1];
        
//         for(int i = 0; i<len-1; i++){
//             smallAns[i] = input[i];
//         }
        
//         if(input[len-1] == element){
//             return len-1;
//         }else{
        
//     	int ans = binarySearch(smallAns, element);
//         return ans;
//         }

        // }else{
        // return ans;
        // }

	}
}

