public class isSubsequence {

    public static void main(String[] args){
        String s = "acb";
        String t = "ahbgdc";
        boolean hello = true;
        int check = 0;
        for (int i = 0; i < s.length(); i++){
            int pos = position(s.charAt(i), t, check, t.length() - 1);
            if (pos == Integer.MAX_VALUE){
                hello = false;
                break;
            }
            System.out.println("POS: "+pos);
            if (pos < check){
                hello = false;
                break;
            }
            else if (pos >= check){
                check = pos + 1;
                System.out.println("Check: "+check);
                if (check >= t.length()){
                    if (i < s.length() - 1){
                        hello = false;
                        break;
                    }
                    else{
                        hello = true;
                        break;
                    }
                }
            }
        }

        if (hello == false){
            System.out.println("not subsequence");
        }
        else {
            System.out.println("Subsequence");
        }
    }

    public static int position(char letter, String t, int startIndex, int endIndex) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if (t.charAt(endIndex) == letter){
            return endIndex;
        }
        else if (startIndex == endIndex){
            return Integer.MAX_VALUE;
        }
        else{
            left = position(letter, t, startIndex, (startIndex+endIndex)/2);
            System.out.println("Left: "+left);
            right = position(letter, t, ((startIndex+endIndex)/2 + 1), endIndex);
            System.out.println("Right: "+right);
        }
        return Math.min(left, right);
    }
}
