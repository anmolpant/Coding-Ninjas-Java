
public class Lec10_PrintSubstrings {

	public static void printSubstrings(String str) {
		//Your code goes here
        int len = str.length();
        
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<=len; j++){
                System.out.println(str.substring(i,j));
            }
        }
        
	}

}
