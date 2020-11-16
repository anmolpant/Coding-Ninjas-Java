
public class Lec8_TripletSum {
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        
        int len = arr.length;
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i<len; i++){
            
            for (int j = i+1; j<len; j++){
                
                for (int k=j+1; k<len; k++){
                    // if (i==j && j==k && k==i ){
                    //     continue;
                    // }
                    
                    if(x == (arr[i] + arr[j] + arr[k])){
                        count++;
                    }
                    
                    // if (sum ==x){
                    //     count++;
                    // }
                
                }
            }
        }
        
        return count;
    }

}
