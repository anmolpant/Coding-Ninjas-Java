public class Lec10_TwoDArrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][5];
		System.out.println(arr[0]);
		//System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		
		int arr2[][] = new int[4][];
		System.out.println(arr2);
		//System.out.println(arr2[0]);
	//	System.out.println(arr2[0][0]);
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = new int[i + 2];
		}
		
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}

