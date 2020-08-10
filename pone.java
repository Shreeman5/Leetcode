import java.util.Arrays;

public class pone {
    public static void main(String[] args){
        int[] retArr;
        int[] input = {9, 8, 9, 9};
        int counter = 0;
        for(int i = 0; i < input.length; i++){
            if (input[i] == 9){
                counter++;
            }
        }

        if(counter == input.length){
            System.out.println("Hello");
            retArr = new int[input.length + 1];
            retArr[0] = 1;
            for (int i = 1; i < retArr.length; i++){
                retArr[i] = 0;
            }
        }
        else {
            retArr = new int[input.length + 1];
            for (int i = 0; i < retArr.length; i++) {
                retArr[i] = 0;
            }
            int[] output = changeArray(input, 1, retArr);
            output = Arrays.copyOfRange(output, 1, output.length);
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i]);
            }
        }

        for(int i = 0; i < retArr.length; i++){
            System.out.print(retArr[i]);
        }
    }

    private static int[] changeArray(int[] input, int i, int[] retArr) {
        int lastNum = input[input.length - 1];
        System.out.println("Lastnum: "+lastNum);
        if (lastNum + i < 10){
            retArr[input.length] = lastNum + i;
            for (int j = input.length - 1; j >= 1; j--){
                retArr[j] = input[j - 1];
            }
        }
        else{
            retArr[input.length] = 0;
            System.out.println(input.length);
            int[] newArray = Arrays.copyOfRange(input, 0, input.length - 1);
            changeArray(newArray, i, retArr);
        }

        return retArr;
    }

}
