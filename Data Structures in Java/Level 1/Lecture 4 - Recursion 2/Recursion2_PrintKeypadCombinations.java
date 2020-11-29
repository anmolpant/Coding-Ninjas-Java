
public class Recursion2_PrintKeypadCombinations {
	
public static void printKeypad(int input, String output){
        
        if (input == 0){
            System.out.println(output);
            return;
        }
        
        String[] options = keymap(input%10);
        for(int t = 0; t<options.length; t++){
            printKeypad(input/10,options[t]+output);
        }
        //printKeypad(input/10,output);
        
        
        
    }

	public static void printKeypad(int input){
		// Write your code here
		
        String output = "";
        printKeypad(input,output);
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
