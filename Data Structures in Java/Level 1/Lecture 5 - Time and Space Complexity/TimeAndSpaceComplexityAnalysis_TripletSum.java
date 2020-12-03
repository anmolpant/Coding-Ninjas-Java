
public class TimeAndSpaceComplexityAnalysis_TripletSum {
	
	//inefficient asf. Time limit exceeded error in 2 test cases ;-;
	
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            
            for(int j = i+1; j<arr.length; j++){
                
                for (int k = j+1; k<arr.length; k++){
                    
                    if ((arr[i] + arr[j] + arr[k])==num){
                        count++;
                    }
                }
            }
        }
        
        return count;
	}

}
