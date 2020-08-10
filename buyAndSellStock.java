public class buyAndSellStock {

    public static void main(String[] args){
        int[] n = {7,4,5,1,3,6,4};
        int num = profit(n);
        System.out.print(num);
    }

    public static int profit(int[] n) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++){
            if (n[i] < minPrice){
                minPrice = n[i];
            }
            if (n[i] > minPrice){
                maxProfit = Math.max(n[i] - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }

}
