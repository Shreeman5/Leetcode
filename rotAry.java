public class rotAry {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] values = rotate(nums, k);
        for (int i = 0; i < values.length; i++){
            System.out.print(values[i]);
        }
    }

    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        System.out.println();
        reverse(nums, 0, k - 1);
        System.out.println();
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            System.out.println("t:"+temp);
            nums[start] = nums[end];
            System.out.println("ns:"+nums[start]);
            nums[end] = temp;
            System.out.println("ne:"+nums[end]);
            start++;
            end--;
        }
    }
}
