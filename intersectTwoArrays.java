import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class intersectTwoArrays {

    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,3};
        Set<Integer> set = new HashSet<>();
        int counter = Math.min(nums1.length, nums2.length);

        for (int i = 0; i < counter; i++){
            if (nums1.length > nums2.length){
                int value = findCommon(nums2[i], 0, nums1.length - 1, nums1);
                if (value != Integer.MIN_VALUE){
                    set.add(value);
                }
                System.out.println(set);
            }
            else{
                int value = findCommon(nums1[i], 0, nums2.length - 1, nums2);
                if (value != Integer.MIN_VALUE){
                    set.add(value);
                }
                System.out.println(set);
            }
        }
        System.out.println();
        int[] nums3 = new int[set.size()];
        int count = 0;
        for (Integer integer : set) {
            nums3[count] = integer;
            count++;
        }
        for(int i=0; i<nums3.length; i++){
            System.out.println("Element at the index "+i+" is ::"+nums3[i]);
        }
    }

    public static int findCommon(int i, int start, int end, int[] nums) {
        int left = 0;
        int right = 0;
        if (nums[end] == i){
            return i;
        }
        else if (start == end){
            return Integer.MIN_VALUE;
        }
        else{
            if (findCommon(i, start, (start+end)/2, nums) != Integer.MIN_VALUE){
                return i;
            }
            else {
                return findCommon(i, ((start + end) / 2 + 1), end, nums);
            }
        }
    }
}
