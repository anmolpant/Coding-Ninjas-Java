import java.lang.Math;
public class Recursion_GeometricSum {
		public static double findGeometricSum(int k){
			// Write your code here
	        
	        if(k==0){
	            return 1;
	        }
	        
	        
	        //double sum = 1/(Math.pow(2,k));
	        double smallAns = findGeometricSum(k-1);
	        double ans = smallAns + 1/(Math.pow(2,k));
	        return ans;

		}
}
