
public class Lec9_SumOfTwoArrays {
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3, small;
        int carry = 0;
        //int small = 0;
        
        if (len1<=len2){
            small = len1;
        }
        
        else{
            small = len2;
        }
        
        if (len1>=len2){
            len3 = len1;
        }else{
            len3 = len2;
        }
        
        len3++;
        //int[] output = new int[len3];
        
        //len-i-1 is the value of the index reqd
        
        for(int i= 0; i<small; i++){
            output[len3 - i - 1] = (arr1[len1-i-1] + arr2[len2-i-1] + carry)%10;
            carry = (arr1[len1-i-1] + arr2[len2-i-1] + carry)/10;
        }
        
        
        if (len1>len2){
            for(int i = len2; i<len1; i++){
                output[len3-i-1] = (arr1[len1-i-1] + carry)%10;
                carry = arr1[len1-i-1]/10;
            }
            
        }
        
        else if(len2>len1){
            for(int i = len1; i<len2; i++){
                output[len3-i-1] = (arr2[len2-i-1] + carry)%10;
                carry = arr2[len2 - i -1]/10;
            }
        }
        
        output[0] += carry;
        
        
        
//         while (carry>0)
        
//         for(int i = 0; i<len1; i++){
//             for(int j = 0; j<len2; j++){
//                 int num = arr1[i] + arr2[j] + carry;
//             }
//         }
        
        //System.out.println(output);
    }

}
