import java.util.HashMap;
import java.util.Map;

public class conDup {

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(findDups(nums));
    }

    public static boolean findDups(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int c = nums[i];
            Integer val = pairs.get(c);
            if (val != null) {
                pairs.put(c, new Integer(val + 1));
                return true;
            }
            else {
                pairs.put(c, 1);
            }
        }
        return false;
    }
}
