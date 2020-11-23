
public class Recursion_SumOfDigits {
	public static int sumOfDigits(int input){
		// Write your code here
        
        if(input==0){
            return 0;
        }
        
        int smallAns = sumOfDigits(input/10);
        int ans = smallAns + (input%10);
        
        return ans;

	}

}
