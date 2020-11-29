
public class Recursion2_ReturnKeypadCode {
	
	public static String[] keypad(int n){
		// Write your code here
        
        if (n==0){
            String ans[] = {""};
            return ans;
        }
        
        
        String[] smallAns = keypad(n/10);
        String[] options = keymap(n%10);
        
        String ans[] = new String[smallAns.length * options.length];
        
        int k = 0;
        for (int i = 0; i<smallAns.length;i++){
            //ans[i] = smallAns[i];
            for(int j = 0; j<options.length; j++){
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        
        return ans;

	}
    
    
    private static String[] keymap(int n){
        if (n==0 || n==1){
            String ans[] = {""};
            return ans;
        }
        
        else if (n==2){
            String ans[] = {"a","b","c"};
            return ans;
        }
        
        else if (n==3){
            String ans[] = {"d","e","f"};
            return ans;
        }
        
        else if(n==4){
            String ans[] = {"g","h","i"};
            return ans;
        }
        
        else if(n==5){
            String ans[] = {"j","k","l"};
            return ans;
        }
        
        else if(n==6){
            String ans[] = {"m","n","o"};
            return ans;
        }
        
        else if(n==7){
            String ans[] = {"p","q","r","s"};
            return ans;
        }
        
        else if(n==8){
            String ans[] = {"t","u","v"};
            return ans;
        }
        
        else if(n==9){
            String ans[] = {"w","x","y","z"};
            return ans;
        } 
        return null;
    }

}
