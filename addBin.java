public class addBin {

    public static void main(String[] args){
        String a = "1111";
        String b = "0111";
        String comPre = findNum(a, b);
        for (int i = 0; i < comPre.length(); i++){
            System.out.print(comPre.charAt(i));
        }
    }

    public static String findNum(String a, String b) {
        if (a.length() > b.length()){
            int difference = a.length() - b.length();
            for (int i = 0; i < difference; i++){
                b = "0" + b;
            }
        }
        else if (a.length() < b.length()){
            int difference = b.length() - a.length();
            for (int i = 0; i < difference; i++){
                a = "0" + a;
            }
        }
        return addStrings(a.toCharArray(), b.toCharArray());
    }

    public static String addStrings(char[] a, char[] b) {
        String acc = "";
        for (int i = a.length - 1; i >= 0; i--){
            if(a[i] + b[i] == 99){
                if (i == 0){
                    acc = "11" + acc;
                }
                else {
                    acc = "1" + acc;
                    a[i - 1] = (char) (a[i - 1] + 1);
                }
            }
            else if (a[i] + b[i] == 98){
                if (i == 0){
                    acc = "10" + acc;
                }
                else {
                    acc = "0" + acc;
                    a[i - 1] = (char) (a[i - 1] + 1);
                }
            }
            else if (a[i] + b[i] == 97){
                acc = "1" + acc;
            }
            else{
                acc = "0" + acc;
            }
        }
        return acc;
    }

}
