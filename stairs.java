public class stairs {

    public static void main(String[] args){
        int n = 4;
        int ways = findWays(n);
        System.out.print(ways);
    }

    public static int findWays(int n) {
        if (n == 0){
            return 1;
        }
        int way1 = 0;
        int way2 = 0;
        if (n == 1){
            int a = n - 1;
            way1 = findWays(a);
        }
        else{
            int a = n - 1;
            int b = n - 2;
            way1 = findWays(a);
            way2 = findWays(b);
        }
        int totalWays = way1 + way2;
        return totalWays;
    }
}
