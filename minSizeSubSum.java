import java.util.ArrayList;
import java.util.List;

public class minSizeSubSum {

    public static void main(String[] args){
        int[] matrix = {2,3,1,2,4,3};
        int target = 7;


        List<Integer> dank = new ArrayList<>();
        int leftIndex = 0;
        int length = Integer.MAX_VALUE;
        int val = 0;

        for (int i = 0; i < matrix.length; i++){
            val = val + matrix[i];
            while (val >= target){
                length = Math.min(length, i+1-leftIndex);
                val = val - matrix[leftIndex];
                leftIndex++;
            }
        }

        System.out.println(length);
    }
}
