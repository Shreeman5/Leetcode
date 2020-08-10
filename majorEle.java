import java.util.HashMap;
import java.util.Map;

public class majorEle {
    public static void main(String[] args){
        int[] n = {6,7,5,7,6,7,5,7,6,7,7};
        int num = majority(n);
        System.out.print(num);
    }

    public static int majority(int[] n) {
        int count = 0;
        Integer candidate = null;

        for (int num : n) {
            if (count == 0) {
                candidate = num;
            }
            count = count + ((num == candidate) ? 1 : -1);
            System.out.println(count);
        }

        return candidate;
    }
}
