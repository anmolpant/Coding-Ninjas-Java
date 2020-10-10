import java.util.Scanner;
public class Cel2FahTable {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
        int e = scan.nextInt();
        int w = scan.nextInt();
        int fah;
        
        while (s<=e){
            fah = ((5*(s-32))/9);
            System.out.println(s +"	"+ fah);
            s = s + w;
        }
	}

}