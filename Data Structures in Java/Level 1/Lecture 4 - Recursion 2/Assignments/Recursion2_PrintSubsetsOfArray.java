
public class Recursion2_PrintSubsetsOfArray {
	private static void printSubsets(int input[], int start, int output[]){
        if (start == input.length){
            //op print kar diyo idhar
            
            for(int i = 0; i<output.length; i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        
        //call if we not including the first element
        printSubsets(input, start+1, output);
        
        //make new array if we including the first element 
        int[] newOutput = new int[output.length+1];
        
        //copy previous o/p
        for(int i = 0; i<output.length; i++){
            newOutput[i] = output[i];
        }
        
        //add the starting element
        newOutput[newOutput.length-1] = input[start];
        
        //call if we are
        printSubsets(input, start+1, newOutput);
    }
    
    
	public static void printSubsets(int input[]) {
		// Write your code here
        
        int start = 0;
        int[] output = new int [0];
        
        printSubsets(input, start, output);

	}

}
