
public class Lec10_SpiralPrint {
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int rows = matrix.length;
        int cols = 0;
        if(rows!=0){
            cols = matrix[0].length;
        }
        
        int rs = 0;
        int cs = 0;
        int re = rows-1;
        int ce = cols-1;
        int count = 0;
        
        while(count<(rows * cols)){
        
        for(int i = cs; i<=ce; i++){
            System.out.print(matrix[rs][i] + " ");
            count++;
        }
         rs++;
        
        for(int i = rs; i<=re; i++){
            System.out.print(matrix[i][ce]+ " ");
            count++;
        }
        ce--;
        
        
        for(int i = ce; i>=cs; i--){
            System.out.print(matrix[re][i] + " ");
            count++;
        }
        re--;
      
        
        for(int i = re; i>=rs; i--){
            System.out.print(matrix[i][cs] + " ");
            count++;
        }
        cs++;
        }

        
//         for(int i = 0; i<rows; i++){
//             if(i==0){
//                 for(int j = 0; j<cols; j++){
//                     System.out.print(matrix[i][j] + " ");
//                 }
//             }
//         }
        
        
//         for(int j = 0; j<cols-1; j++){
//             if (j==4){
//                 for(int i = 0; i<rows; i++){
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             }
            
//         }
	}
}

