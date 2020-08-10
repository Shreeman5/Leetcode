public class cNN {

    public static void main(String[] args){
        int[][] grid = {{-1,-1,-2,-3}, {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2}};
        int newVal = 0;
        for (int i = 0; i < grid.length; i++) {
            int j = grid[i].length;
            if (grid[i][0] < 0 && grid[i][j - 1] < 0){
                newVal += j;
                System.out.println("A: " +newVal);
            }
            else {
                newVal += find(0, grid[i].length - 1, grid[i], grid[i].length);
                System.out.println("B: "+newVal);
            }
        }
        System.out.println(newVal);
    }

    public static int find(int i, int length, int[] element, int k) {
        if (element[i] >= 0 && element[i + 1] < 0){
            System.out.println("hello");
            return k - (i + 1);
        }
        else if (i == length){
            return k - i;
        }
        else if (element[i] >= 0 && element[i + 1] >= 0){
            int a = (i+length)/2 + 1;
            System.out.println("c: "+a);
            System.out.println("d: "+length);
            return find((i+length)/2 + 1, length, element, k);
        }
        else{
            System.out.println("e: "+(i+length)/2);
            return find(0, (i+length)/2, element, k);
        }
    }

    //{-1,-1,-2,-3}, {4,3,2,-1},{3,2,1,-1},
}
