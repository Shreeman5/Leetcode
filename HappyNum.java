public class HappyNum {

    public static void main(String[] args){
        int num = 19;
        boolean newVal = happy(num);
        System.out.println(newVal);
    }

    public static boolean happy(int num) {
        if (num == 0 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 8 || num == 9){
            System.out.println("dank");
            return false;
        }
        else if (num == 1 || num == 7 || num == 10){
            System.out.println("hello");
            return true;
        }

        int sum = 0;
        while (num != 0){
            sum = sum + ((num % 10) * (num % 10));
            num = num /10;
        }
        System.out.println(sum);
        return happy(sum);
    }
}
