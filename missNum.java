public class missNum {

    public static void main(String[] args){
        int[] n = {3,0,1};
        int num = miss(n);
        System.out.print(num);
    }

    public static int miss(int[] n) {
        int sum1 = 0;
        for (int i = 0; i < n.length; i++){
            sum1 += n[0];
        }
        int sum2 = 0;
        for (int j = 0; j <= n.length; j++){
            sum2 += j;
        }
        return sum2 - sum1;
    }
}
