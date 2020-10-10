import java.util.Scanner;
public class FindChar {
			public static void main(String[] args) {
				// Write your code here
		        Scanner s = new Scanner(System.in);
		        char c=s.next().charAt(0);
		        
		        if (c>=97 && c<=122){
		           System.out.print(0);
		        }else   if (c>=65 && c<=90){
		            System.out.print(1);
		        }else
		        {System.out.print(-1);
		        }
			}

	}

