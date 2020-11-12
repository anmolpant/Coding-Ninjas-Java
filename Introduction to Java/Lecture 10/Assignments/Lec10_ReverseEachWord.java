
public class Lec10_ReverseEachWord {
	public static String reverseEachWord(String str) {
		//Your code goes here
        String rev = "";
        int start = 0;
        String finalans = "";
        int len = str.length();
        //int space = str.length();
        
        for(int i = 0; i<len; i++){
            if (str.charAt(i) == ' '){
                for(int j =start; j<i; j++){
                    rev = str.charAt(j) + rev;
                }
            		//rev = str.substring(i+1, space) +rev;
                	//space = i;
                	start = i;
                	}
            
            else if (i==len-1){
                for(int j = start; j<len; j++){
                    rev = str.charAt(j) +rev;
                }
            }
            
            // else if(i==0){
            //     rev = str.substring(0,space) + rev;
            // }
    			}
        
        int space = rev.length();
        //System.out.println(space);
        for(int i = rev.length()-1; i>=0;i--){
            if (i==0){
                finalans = finalans+rev.substring(0,space);
            }
            
            else if(rev.charAt(i)== ' '){
                finalans = finalans+rev.substring(i+1,space)+" ";
                space = i;
            }
        }
        
        return finalans;
        
        //return rev;
	}

}
