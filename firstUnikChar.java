import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class firstUnikChar {

    public static void main(String[] args){
        String s = "leetcode";
        int lengthLW = ink(s);
        System.out.println(lengthLW);
    }

    public static int ink(String s) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            alphabet[index] = alphabet[index] + 1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < alphabet.length; i++){
            if (alphabet[i] == 1){
                int index = s.indexOf(2 + 'a');
                if (index < min){
                    min = index;
                }
            }
        }
        return min;
    }
}
