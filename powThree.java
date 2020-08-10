public class powThree {

    public static void main(String[] args){
        int n = 45;
        boolean num = truth(n);
        System.out.print(num);
    }

    public static boolean truth(int n) {
        double x = Math.log(n) / Math.log(3);
        if (x == (int) x){
            return true;
        }
        return false;
    }
}
