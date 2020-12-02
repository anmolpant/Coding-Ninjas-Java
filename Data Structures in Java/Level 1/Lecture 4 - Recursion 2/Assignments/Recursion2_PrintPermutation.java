import java.util.ArrayList;
public class Recursion2_PrintPermutation{
//     private static String FindPermutations(String input, String output){
        
//         String ans = "";
        
//         if (input.length()==0){
//             System.out.println(output);
//             return null;
//         }
        
//         for(int i = 0; i<input.length(); i++){
//             ans = FindPermutations(input.substring(0,i) + input.substring(i+1), output + input.charAt(i));
//         }
        
//         return ans;
        
//     }
    
    
    public static ArrayList<String> FindPermutations(String str) {
        
//         String output = "";
//         ArrayList<String> jawaab = FindPermutations(STR, output);
//         return jawaab;

        
//         // Write your code here!

//     }
        
    if (str.length() == 0) {
        ArrayList<String> empty = new ArrayList<>();
        empty.add("");
        return empty;
      }
        
      char ch = str.charAt(0);
      String subStr = str.substring(1);
        
      ArrayList<String> lastCombination = FindPermutations(subStr);
      ArrayList<String> newCombination = new ArrayList<>();
      for (String val : lastCombination) {
      for (int i = 0; i <= val.length(); i++) {
            newCombination.add(val.substring(0, i) + ch + val.substring(i));
         }
       }
      return newCombination;
    }

}
