
public class Test2_LeadersInArray {
	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        
        int len = input.length;
       
        
        for(int i=0; i<len; i++){
            boolean smaller = true;
            for(int j = i+1;j<len;j++){
            if(input[i] < input[j]){
                smaller = false;
                //System.out.print(input[i]);
                break;
            }
                }
            
            
            if (smaller){
                System.out.print(input[i] + " ");
            }
        }
		
	}

}
