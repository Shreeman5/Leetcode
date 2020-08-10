public class uglyNum {

    public static void main(String[] args) {
        int num = 4;
        int[] arr = new int[num];
        int a = 2;
        int b = 3;
        int c = 4;
        int counter = 0;
        int i = a;
        while (arr[num - 1] == 0){
            if (i % a == 0 || i % b == 0 || i % c == 0){
                arr[counter] = i;
                counter++;
            }
            i++;
        }
    }
}
