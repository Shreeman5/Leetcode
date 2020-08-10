import java.util.Arrays;

public class mountain {

    public static void main(String[] args){
        int[] input = {2,7,11,13,14,15,16,17,9,8,7,6,5,4,3,2};

        int i = 1;
        int j = input.length - 2;

        int index = isMountain(i, j, input);
        System.out.println(index);
    }

    public static int isMountain(int i, int j, int[] input) {
        if (input[j] > input[j - 1] && input[j] > input[j + 1]){
            return j;
        }
        else if (input[j] > input[j - 1] && input[j] < input[j + 1]){
            int k = j + j/2;
            if (k > input.length - 2){
                k = input.length - 2;
            }
            return isMountain(j,k,input);
        }
        else{
            return isMountain(i, (i+j)/2, input);
        }
    }
}
