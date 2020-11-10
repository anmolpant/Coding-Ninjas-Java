public class Lec10_LargestRowOrColumn {

	public static void findLargest(int mat[][]){
		//Your code goes here
        
        int max_row_sum = Integer.MIN_VALUE;
        int max_row = 0;
        int max_col_sum = Integer.MIN_VALUE;
        int max_col = Integer.MIN_VALUE;
        
        int rows = mat.length;
        int cols = 0;
        if(rows!=0){
            cols = mat[0].length;
        }
        
        // int rows = mat.length;
        // int cols = mat[0].length;
        
        for(int i = 0; i<rows; i++){
            int row_sum = 0;
            for(int j = 0; j<cols; j++){
                row_sum+= mat[i][j];
            }
            
            if(row_sum>max_row_sum){
                max_row_sum = row_sum;
                max_row = i;
            }
            
        }
            
        for(int i = 0; i<cols; i++){
            int col_sum = 0;
            for(int j = 0; j<rows; j++){
                col_sum+= mat[j][i];
            }
            
            if(col_sum>max_col_sum){
                max_col_sum = col_sum;
                max_col = i;
            }
        }
            
        if (max_row_sum>=max_col_sum){
            System.out.println("row "+ max_row + " " + max_row_sum);
            //System.out.println("Your answer is: " + answer);
        } else{
            System.out.println("column "+ max_col + " " + max_col_sum);
        }
            
        }

}

