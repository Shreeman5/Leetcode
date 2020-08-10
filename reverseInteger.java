public class reverseInteger {

    public static void main(String[] args){
        int num = -123;
        int newVal = reverse(num);
        System.out.println(newVal);
    }

    public static int reverse(int num) {
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            return 0;
        } else if (num < 0) {
            int nume = Math.abs(num);
            return -(reverseIt(nume));
        } else {
            return reverseIt(num);
        }
    }

    public static int reverseIt(int num){
        if (num == 0){
            return 0;
        }
        int modVal = num % 10;
        int length = (int)(Math.log10(num));
        for (int i = 0; i < length; i++){
            long hello = (long)modVal * 10;
            if (hello > Integer.MAX_VALUE || hello * 10 < Integer.MIN_VALUE){
                return 0;
            }
            else {
                modVal = modVal * 10;
            }
        }
        long checkVal = (long)modVal + (long)reverseIt(num / 10);
        int checkSum = (int) checkVal;
        if (checkSum == checkVal) {
            return checkSum;
        }
        else{
            return 0;
        }
    }
}
