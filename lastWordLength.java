public class lastWordLength {

    public static void main(String[] args){
        String s = " abc d  ";
        int lengthLW = lW(s);
        System.out.println(lengthLW);
    }

    public static int lW(String s) {

        if (s.trim().length() == 0){
            return 0;
        }

        String x = new StringBuilder(s).reverse().toString();
        String z = x.trim();
        int len = 0;
        int i = 0;
        while(i < z.length()){
            if (z.charAt(i) == ' ')
                len = 0;
            else
                len++;
            i++;
        }
        return len;
    }
}
