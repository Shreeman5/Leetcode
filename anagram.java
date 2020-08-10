import java.util.HashMap;
import java.util.Map;

public class anagram {

    public static void main(String[] args){
        String s = "rat";
        String t = "tar";
        boolean equal = truth(s, t);
        System.out.println(equal);
    }

    public static boolean truth(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int sVal = 0;
        int tVal = 0;
        for (int i = 0; i < s.length(); i++){
            sVal += s.charAt(i);
            tVal += t.charAt(i);
        }
        if (sVal != tVal){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Integer val;
        for (int i = 0; i < s.length(); i++){
            val = map.get(s.charAt(i));
            System.out.println(val);
            if (val != null) {
                map.put(s.charAt(i), new Integer(val + 1));
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            val = map.get(t.charAt(i));
            System.out.println(val);
            if (val != null) {
                map.put(t.charAt(i), new Integer(val - 1));
            }
            else {
                map.put(t.charAt(i), 1);
            }
        }
        for(char c:map.keySet()){
            if(map.get(c)!=0){return false;}
        }
        return true;
    }
}
