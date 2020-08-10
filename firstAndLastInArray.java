import java.util.Arrays;

public class firstAndLastInArray {

    public static void main(String[] args){
        int[] input = {-3,-2,-1};
        int target = 0;
        int i = 0;
        int j = input.length - 1;
        boolean left = true;
        int[] output = new int[2];
        for (int k = 0; k < output.length; k++){
            int index = findIndex(i, j, input, left, target,j);
            if (index == -1){
                output[k] = index;
                output[k+1] = index;
                break;
            }
            else{
                output[k] = index;
                i = index;
                left = false;
            }
        }

        System.out.println(Arrays.toString(output));
    }

    public static int findIndex(int i, int j, int[] input, boolean left, int target, int max) {
        if (input[j] == target){
            if (left){
                System.out.println("hello");
                if (j - 1 < 0){
                    return j;
                }
                else if (input[j - 1] == target){
                    return findIndex(i, (i+j)/2, input, left, target, max);
                }
                else{
                    return j;
                }
            }
            else{
                System.out.println("hi");
                if (j + 1 > input.length - 1){
                    return j;
                }
                else if (input[j + 1] == target){
                    return findIndex(j, j + j/2, input, left, target, max);
                }
                else{
                    return j;
                }
            }
        }
        else if (i == j){
            return -1;
        }
        else if (input[j] > target){
            return findIndex(i, (i+j)/2, input, left, target, max);
        }
        else{
            int k;
            if (j == 1){
                k = 2;
            }
            else{
                k = j + j/2;
            }
            if (k > max){
                k = max;
            }
            return findIndex(j, k, input, left, target, max);
        }
    }
}
