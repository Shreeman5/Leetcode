import java.util.HashMap;

public class findDiff {

    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        char lengthLW = diff(s,t);
        System.out.println(lengthLW);
    }

    private static char diff(String s, String t) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < t.length(); i++){
            if (i < s.length()) {
                a = a + s.charAt(i);
            }
            b = b + t.charAt(i);
        }
        return (char)(b-a);
    }
}
