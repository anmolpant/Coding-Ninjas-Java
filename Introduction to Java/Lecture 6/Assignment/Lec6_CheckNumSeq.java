import java.util.Scanner;
public class Lec6_CheckNumSeq {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        int dirn = 0;
        int curr;
        boolean ans = true;
        
        for (int i = 1; i<=n; i++){
            curr = s.nextInt();
            
            if (curr-prev==0){
                ans = false;
                break;
                
            }
            
            else if (curr-prev>0 && dirn == 0){
                dirn =1;
            }
            
            else if (curr-prev<0 && dirn==1){
                ans = false;
                break;
            }
            
            else if (curr-prev<0){
                dirn =0;
            }
            
            prev = curr;
            
            
            
        }
        
        System.out.println(ans);
        

	}
}


