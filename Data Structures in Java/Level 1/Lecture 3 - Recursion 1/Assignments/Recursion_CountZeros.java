
public class Recursion_CountZeros {
	public static int countZerosRec(int input){
		// Write your code here
        
        
//         if (input==0){
//             return 0;
//         }
        
//         int smallAns = countZerosRec(input/10);
//         int ans = smallAns++;
        
//         return ans;
        
        if (input%10 == 0){
            return 1 + countZerosRec(input/10);
        }
        
        else if (input/10 == 0){
            return 0;
        }
        
        else{
            return countZerosRec(input/10);
        }
	}

}
