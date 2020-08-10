public class nextGreatLetter {

    public static void main(String[] args){
        char[] input = {'a', 'c', 'c', 'j'};
        int i = 0;
        int j = input.length - 1;
        char target = 'd';
        char index = nextGreatestLetter(i, j, input, target);
        System.out.println(index);
    }

    public static char nextGreatestLetter(int i, int j, char[] input, char target) {
        if (input[j] == target){
            System.out.println("found it");
            return input[j];
        }
        else if (i == j){
            System.out.println("didn't find element");
            return input[j];
        }
        else {
            int mid = (i + j) / 2;
            System.out.println("mid:" + mid);
            char left = nextGreatestLetter(i, mid, input, target);
            System.out.println("left: " + left);
            char right = nextGreatestLetter(mid + 1, j, input, target);
            System.out.println("right: " + right);
            if (target >= left && target < right) {
                System.out.println("found in this interval");
                return right;
            }
            else{
                System.out.println("not found in this interval");
                return left;
            }
        }
    }
}
