import java.util.Scanner;
public class AvgMarks {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        

		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
        String st = s.nextLine();
        char n = st.charAt(0);
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int avg = (m1+m2+m3)/3;
        
        System.out.println(n);
		
		System.out.println(avg);

	}

}

