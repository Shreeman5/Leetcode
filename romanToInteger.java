import java.util.HashMap;
import java.util.Map;

public class romToInt {

    public static void main(String[] args){
        int acc = 0;
        String roman = "IV";
        Map<Character, Integer> pairs = new HashMap<>();
        pairs.put('I', 1);
        pairs.put('V', 5);
        pairs.put('X', 10);
        pairs.put('L', 50);
        pairs.put('C', 100);
        pairs.put('D', 500);
        pairs.put('M', 1000);
        int val = convert(roman, acc, pairs);
        System.out.println(val);
    }

    public static int convert(String roman, int acc, Map<Character, Integer> pairs) {
        if(roman.length() == 0){
            return acc;
        }

        if (roman.length() == 1){
            acc = acc + pairs.get(roman.charAt(0));
        }
        else {
            if (roman.charAt(0) == 'I') {
                if (roman.charAt(1) == 'V' || roman.charAt(1) == 'X') {
                    acc--;
                    System.out.println("aucc: " + acc);
                }
            }
            else if(roman.charAt(0) == 'X'){
                if (roman.charAt(1) == 'L' || roman.charAt(1) == 'C') {
                    acc = acc - 10;
                    System.out.println("cucc: " + acc);
                }
            }
            else if (roman.charAt(0) == 'C'){
                if (roman.charAt(1) == 'D' || roman.charAt(1) == 'M') {
                    acc = acc - 100;
                    System.out.println("eucc: " + acc);
                }
            }
            acc = acc + pairs.get(roman.charAt(0));
            System.out.println("gucc: " + acc);
        }

        return convert(roman.substring(1), acc, pairs);
    }
}
