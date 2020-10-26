import java.util.Scanner;
public class Lec8_ArrayInput {
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		int input[] = new int[size];
		
		for (int i =0; i < size; i++) {
			//insert value
			input[i]= s.nextInt();
		}
		
		return input;
	}
	
	public static void print(int input[]) {
		//print
		int size = input.length;
				for (int i =0; i< size; i++) {
					System.out.print(input[i] +" ");
				}
				
				System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = takeInput();
		print(arr);

	}

}
