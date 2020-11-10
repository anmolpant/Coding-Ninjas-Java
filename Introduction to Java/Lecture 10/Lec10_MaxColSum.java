import java.util.Scanner;

public class Lec10_MaxColSum {

	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = s.nextInt();
		System.out.println("Number of columns ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j ++){
				System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void print(int[][] input){
		int rows = input.length;
		int cols = input[0].length;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int largestColSum(int input[][]){
		int largest = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;
		
		for(int j = 0; j < cols; j++){
			int sum = 0;
			for(int i = 0; i < rows; i++){
				sum = sum + input[i][j];
			}
			if(sum > largest){
				largest = sum;
			}
		}
		
		return largest;

	}

	public static void main(String[] args) {
		//		int arr2d[][] = new int[3][4];
		//		System.out.println(arr2d[1][2]);
		//		arr2d[2][0] = 15;
		//		System.out.println(arr2d[2][0]);
		//		
		//		int arr2[][] = {{1,2,3},{4,5,6}};
		//		print(arr2);
		//		System.out.println(arr2);
		//		System.out.println(arr2.length);
		//		for(int i = 0; i < 2; i++)
		//			System.out.println(arr2[i].length);

		int input[][] = takeInput();
		print(input);
		System.out.println("Largest col sum "+ largestColSum(input));
	}
}

