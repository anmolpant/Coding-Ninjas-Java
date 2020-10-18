import java.util.Scanner;

public class Lec5_DiamondOfStars {
  public static void main(String args[]){
    //take input
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
      //splitting pattern into two halves
    int num=(n/2)+1;
     //to keep track of spaces (div 1)
    int count = num - 1;
    for(int i = 1; i <= num; i++) {
        for(int j = 1; j <= count; j++) {
          System.out.print(" ");
        }
		//reducing count of spaces
        count--;
		
        //to print stars for pattern division 1
        for(int k = 1; k <= (2 * i) - 1; k++) {
          System.out.print("*");
        }
        
        //moving to next line

        System.out.println("");
    }
      //reinitializing counter
      count = 1;
      //first half of pattern done
      
      //second half
      //number of rows = num-1
      
      //printing spaces for second half
      for (int i=1;i<=(num-1);i++){
          for (int j=1; j<=(count);j++){
              System.out.print(" ");
          }
          
          //increasing the number of spaces
          count++;
          
          //printing stars for second half
          for(int k=1; k<=(2*(num-i))-1; k++){
              System.out.print("*");
          }
          
          System.out.println("");
      }
        
  }  
        
    }

