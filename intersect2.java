public class intersect2 {

    public static void main(String[] args){
        int[] input1 = {2,2};
        int[] input2 = {1,2,1,1};
        int min = Math.min(input1.length, input2.length);
        String input3 = "";
        if (input1.length == min){
            for (int i = 0; i < input1.length; i++){
                input3 += findInter(0, input2.length - 1, input2, input1[i]);
                System.out.println(input3);
            }
        }
        else{
            for (int i = 0; i < input2.length; i++){
                input3 += findInter(0, input1.length - 1, input1, input2[i]);
            }
        }
        System.out.println(input3);
    }

    public static char findInter(int i, int j, int[] input, int target) {
        if (input[j] == target){
            return (char) (target + 48);
        }
        else if (i == j){
            return (char) 0;
        }
        else{
            int left = findInter(i, (i+j)/2, input, target);
            int right = findInter((i+j)/2 + 1, j, input, target);
            return (char) Math.max(left, right);
        }
    }
}
