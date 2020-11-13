
public class Test2_Print2DArray {
	public static void print2DArray(int input[][]) {
		// Write your code here
        int rows = input.length;
        int cols = input[0].length;
        
        for(int i = 0; i<rows; i++){
            for(int k = 0; k<rows-i; k++){
            for(int j = 0; j<cols; j++){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
            }
        }

	}

}
