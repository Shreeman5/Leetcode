import java.util.*;

public class sinNum {

    public static void main(String[] args){
        int[] n = {4,1,2,1,2,4,3};
        int num = single(n);
        System.out.print(num);
    }

    public static int single(int[] n) {
        Arrays.sort(n);
        for (int i = 0; i < n.length - 1; i++){
            if (n[i] == n[i + 1]){
                i++;
            }
            else{
                return n[i];
            }
        }
        return 0;
    }
}
