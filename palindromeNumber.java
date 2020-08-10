public class palindromeNumber {

    public static void main(String[] args){
        int x = 121; //Can be any number
        if (x == reverse(x)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int reverse(int num) {
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            return 0;
        } else if (num < 0) {
            return 0;
        } else {
            return reverseIt(num);
        }
    }

    public static int reverseIt(int num){
        int val = 0;
        while (num != 0){
            int mod = num % 10;
            val = val * 10 + mod;
            num = num / 10;
        }
        return val;
    }
}
