
public class Lec10_CountWords {

	public static int countWords(String str) {	
		//Your code goes here
        
        int wordcount = 1;
        
        if(str.length() == 0){
            return 0;
        }
        
        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                wordcount++;
            }
        }
        return wordcount;
	}

}
