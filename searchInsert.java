public class searchInsert {

    public static void main(String[] args){
        int[] input = {1,3,5,6,7,8,13,14,15,16};
        int i = 0;
        int j = input.length - 1;
        int target = 10;
        int index = findIndex(i, j, input, target);
        System.out.println(index);
    }

    public static int findIndex(int i, int j, int[] input, int target) {
        if(input[j] == target){
            return j;
        }
        else if (i == j){
            return i + 1;
        }
        else if (input[j] > target){
            System.out.println("A: "+i+ " " +(i+j)/2);
            return findIndex(i, (i+j)/2, input, target);
        }
        else if (input[j] < target){
            System.out.println("B: "+j + " " +(j + j/2));
            int x = j + j/2;
            if (x >= input.length){
                x = input.length - 1;
            }
            return findIndex(j, x, input, target);
        }
        return -1;
    }

}
