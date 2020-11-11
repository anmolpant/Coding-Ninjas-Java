public class Lec10_RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        
        int len = str.length();
        String x = "";
        for(int i = 0; i<len; i++){
            if (str.charAt(i) != ch){
                x = x+str.charAt(i);
            }
        }
        return x;
	}
}
