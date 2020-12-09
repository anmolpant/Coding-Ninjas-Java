
public class Test1_SplitArray {
	
public static boolean helperFunction(int arr[], int n, int start, int lsum, int rsum){
        
        if (start == n){
            return lsum == rsum;
        }
        
        if (arr[start]%5==0){
            lsum += arr[start];
        }
        
        else if (arr[start]%3==0){
            rsum += arr[start];
        }
        
        else {
            
            return helperFunction(arr,n,start+1,lsum+arr[start], rsum) || helperFunction(arr, n, start+1, lsum, rsum+arr[start]);
        }
        
        return helperFunction(arr,n,start+1,lsum,rsum);
    }

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        
        int lsum = 0;
        int rsum = 0;
        int start = 0;
        int n = input.length;
        
        return helperFunction(input,n,start,lsum,rsum);
		
	}

}
