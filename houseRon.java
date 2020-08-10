public class houseRon {

    public static void main(String[] args){
        int[] n = {2,4,8,9,9,3};
        int num = profit(n);
        System.out.print(num);
    }

    public static int profit(int[] n) {
        if(n.length == 1){
            return n[0];
        }
        else if (n.length == 2){
            return Math.max(n[0], n[1]);
        }
        else if (n.length == 3){
            return Math.max(n[0] + n[2], n[1]);
        }

        int[] helper = new int[n.length];
        int i = 0;
        while (i < n.length){
            helper[i] = Math.max(n[i], helper[i]);
            System.out.println("A: "+helper[i]);
            if (i + 1 < n.length) {
                helper[i + 1] = Math.max(n[i + 1], helper[i + 1]);
                System.out.println("B: " + helper[i + 1]);
            }
            if (i + 2 < n.length) {
                helper[i + 2] = helper[i] + n[i + 2];
                System.out.println("C: " + helper[i + 2]);
            }
            if (i + 3 < n.length) {
                int temp1 = helper[i] + n[i + 3];
                int temp2 = helper[i + 1] + n[i + 3];
                helper[i + 3] = Math.max(temp1, temp2);
                System.out.println("D: " + helper[i + 3]);
            }
            if (i + 4 < n.length) {
                helper[i + 4] = helper[i + 1] + n[i + 4];
                System.out.println("E: "+helper[i + 4]);
            }
            i = i + 2;
        }

        int max = 0;
        for (int j = 0; j < helper.length; j++){
            max = Math.max(max, helper[j]);
        }
        return max;
    }
}
