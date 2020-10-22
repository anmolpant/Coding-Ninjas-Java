public class Lec7_FahToCelTable {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        
        while(start<=end){
            int cel = (int)((start-32)*(0.5556));
            System.out.println(start+"\t"+cel);
            start = start+step;
            
        }
		
	}
}
