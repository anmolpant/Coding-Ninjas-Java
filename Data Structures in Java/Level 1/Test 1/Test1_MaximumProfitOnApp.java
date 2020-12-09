import java.util.*;
public class Test1_MaximumProfitOnApp {

		public static int maximumProfit(int budget[]) {
			// Write your code here
	        int ans = Integer.MIN_VALUE;
	        int n = budget.length;
	        
	        //sort array
	        Arrays.sort(budget);
	        
	        for(int i = 0; i<n; i++){
	            
	            ans = Math.max(ans, budget[i] * (n-i));
	        }
	        
	        return ans;

}
	}
