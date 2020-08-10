import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class kWeak {

    public static void main(String[] args){
        int[][] input = {{1,1,0,0,0},
                         {1,1,1,1,0},
                         {1,0,0,0,0},
                         {1,1,0,0,0},
                         {1,1,1,1,1}};
        int k = 3;
        int[] weakest = new int[k];
        double counter = 0.0000000000001;
        TreeMap<Double, Integer> positions = new TreeMap<>();

        for (int i = 0; i < input.length; i++){
            int soldiers = 0;
            if (input[i][0] == 0){
                soldiers = 0;
                //System.out.println("A: "+soldiers);
            }
            else if (input[i][0] == 1 && input[i][1] == 0){
                soldiers = 1;
                //System.out.println("B: "+soldiers);
            }
            else if (input[i][0] == 1 && input[i][input[i].length - 1] == 1){
                soldiers = input[i].length;
                //System.out.println("C: "+soldiers);
            }
            else {
                soldiers = findWeakest(input[i], 1, input[i].length - 1);
                //System.out.println("D: "+soldiers);
            }

            positions.put(soldiers+counter, positions.getOrDefault((double)soldiers, 0) + i);
            counter = counter + 0.0000000000001;
        }

        System.out.println(positions);

        int count = 0;
        for (Map.Entry<Double, Integer> entry : positions.entrySet()) {
            if (count >= weakest.length){
                break;
            }
            weakest[count] = entry.getValue();
            count++;
        }
        System.out.println(Arrays.toString(weakest));
    }

    public static int findWeakest(int[] row, int i, int j) {
        if (row[j] == 0 && row[j - 1] == 1){
            return j;
        }
        else if (row[j] == 0 && row[j - 1] == 0){
            return findWeakest(row, i, (i+j)/2);
        }
        else{
            int k = j + j/2;
            if (k > row.length - 1){
                k = row.length - 1;
            }
            return findWeakest(row, j, k);
        }
    }
}
