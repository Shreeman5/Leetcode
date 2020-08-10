public class serach2D {

    public static void main(String[] args){
        int[][] matrix = {{1,3,5,6}};
        System.out.println(matrix.length);
        int target = 0;
        int rangeArr = findRange(matrix, 0, matrix.length-1, target, matrix.length - 1);
        System.out.println(rangeArr);
        System.out.println();
    }

    public static int findRange(int[][] matrix, int i, int j, int target, int max) {
        if (target >= matrix[j][0] && target <= matrix[j][matrix[j].length - 1]){
            return j;
        }
        else if (i == j){
            return -1;
        }
        else if (target < matrix[j][0]){
            return findRange(matrix, i, (i+j)/2, target, max);
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
            return findRange(matrix, j, k, target, max);
        }
    }
}
