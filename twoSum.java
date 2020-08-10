import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static void main(String[] args){
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] indices = summation(nums, target);
        System.out.println(indices[0] + "," + indices[1]);
    }

    private static int[] summation(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            pairs.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(pairs.containsKey(complement) && nums[i] != complement){
                return new int[] {i, pairs.get(complement)};
            }
        }
        return new int[] {-1, -1};
    }
}
