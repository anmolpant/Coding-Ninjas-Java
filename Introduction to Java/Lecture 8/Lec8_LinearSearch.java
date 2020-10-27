import java.util.Scanner;
public class Lec8_LinearSearch {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        
        int len = arr.length;
        
        for (int i = 0; i<len; i++){
            if (arr[i] == x){
                return i;
            }
        }
        
        return -1;
    }
}
