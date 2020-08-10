public class isUgly {

    public static void main(String[] args){
        int num = 11;
        int[] dp = new int[num];
        dp[0] = 1;
        int leftPointer = 0;
        int midPointer = 0;
        int rightPointer = 0;
        for (int i = 1; i < num; i++) {
            int leftNum = dp[leftPointer] * 2;
            int midNum = dp[midPointer] * 3;
            int rightNum = dp[rightPointer] * 5;

            int next = Math.min(leftNum, Math.min(midNum, rightNum));

            if (next == leftNum) {
                leftPointer++;
            }
            if (next == midNum) {
                midPointer++;
            }
            if (next == rightNum) {
                rightPointer++;
            }
            dp[i] = next;
        }
        System.out.println(dp[10]);
    }
}
