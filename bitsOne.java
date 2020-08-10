public class bitsOne {

    public static void main(String[] args) {
        int num = 00000111;
        System.out.println(findOnes(num));
    }

    public static int findOnes(int num) {
        return Integer.bitCount(num);
    }
}
