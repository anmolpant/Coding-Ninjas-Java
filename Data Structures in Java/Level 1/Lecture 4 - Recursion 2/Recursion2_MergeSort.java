
public class Recursion2_MergeSort {
public static void merge(int[] arr, int start, int mid, int end){
        
        //initialize index values
        int n1 = mid - start + 1;
        int n2 = end - mid;
    
    
    // create arrays
    int [] L = new int[n1];
    int [] R = new int[n2];
    
    //copy elements
    for(int i = 0; i<n1; i++){
        L[i] = arr[start + i];
    }
    
    for(int j = 0; j<n2; j++){
        R[j] = arr[mid+1+j];
    }
    
    //merge the arrays 
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    k = start;
    
    while (i<n1 && j<n2){
        if (L[i]<=R[j]){
            
            arr[k] = L[i];
            i++;
            //i++;
            //j++;
        }else{
        
        //if(L[i]>=R[i]){
            arr[k] = R[j];
            j++;
        }
        k++;
    }
        
        //copy remaining elements
        
        while (i<n1){
            arr[k]= L[i];
            i++;
            k++;
        }
        
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    
    //main sorting function
    
    public static void sort(int [] arr, int start, int end){
        
        // if (start>=end){
        //     return;
        // }
        
        //base case
        if (start<end){
        
        int mid = (start + end)/2;
        
        //recursive call on first array
        sort(arr, start, mid);
        //recursive call on second array
        sort(arr, mid+1, end);
        
        //merging the sorted arrays
        merge(arr, start, mid, end);
    }
    }
    

	public static void mergeSort(int[] input){
		// Write your code here
		
        sort(input,0,input.length-1);
	}

}
