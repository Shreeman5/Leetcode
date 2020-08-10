import java.util.Arrays;

public class twoSumTwo {

    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int target = 9;

        int i = 0;
        int j = input.length - 1;

        int[] k = new int[2];

        int[] indices = sum(i, j, input, target, k);
        System.out.println(Arrays.toString(indices));
    }

    public static int[] sum(int i, int j, int[] input, int target, int[] k) {
        if (input[i] + input[j] == target){
            k[0] = i + 1;
            k[1] = j + 1;
            return k;
        }
        else if (input[i] + input[j] > target){
            j = j - 1;
            return sum(i, j, input, target, k);
        }
        else{
            i = i + 1;
            return sum(i, j, input, target, k);
        }
    }
}
