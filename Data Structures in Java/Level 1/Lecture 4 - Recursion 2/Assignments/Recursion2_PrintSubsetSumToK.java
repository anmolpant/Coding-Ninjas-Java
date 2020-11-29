
public class Recursion2_PrintSubsetSumToK {
private static void printSubsetsSumTok(int input[], int k, int start, int output[]){
        
        if (start == input.length){
            //print o/p
            
            if(k==0){
                
            for(int i = 0; i<output.length; i++){
                System.out.print(output[i] + " ");
            }
                
            System.out.println();
            return;
                
            }else{
                
                return;
            }

        }
        
        printSubsetsSumTok(input, k, start+1, output);
        
        int[] newOutput = new int[output.length+1];
        
        for(int i = 0; i<output.length; i++){
            newOutput[i] = output[i];
        }
        
        newOutput[newOutput.length-1] = input[start];
        
        
        printSubsetsSumTok(input, k-input[start] , start+1, newOutput);
    }
    
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        
        int start = 0;
        int[] output = new int[0];
        printSubsetsSumTok(input, k, start, output);
	}

}
