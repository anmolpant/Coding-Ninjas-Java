
public class TimeAndSpaceComplexityArrayIntersection {
	
	 //approach used
    //1. sort the two arrays
    //2. iterate over both the sorted arrays
    //3. check for equivalence of elements
    //handle redundant element case by making the similar element 0 post comparision
    
    
    
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
    

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        sort(arr1, 0, arr1.length-1);
        sort(arr2, 0, arr2.length-1);
        
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = 0;
                    break;
                }
            }
        }
       
	}

}
