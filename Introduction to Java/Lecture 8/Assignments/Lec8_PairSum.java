public class Lec8_PairSum {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        
        int len = arr.length;
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i<len; i++){
            sum = 0;
            for(int j = 0; j<len; j++){
                
                if (i==j){
                    continue;
                }
                sum = arr[i]+arr[j];
                
                if (sum == x){
                    count++;
                }
            }
        }
        
        return (count/2);
    }
}
