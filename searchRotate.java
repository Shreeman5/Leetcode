public class searchRotate {

    public static void main(String[] args){
        int[] input = {278,280,281,286,287,290,2,3,4,8,9,14,15,16,21,24,25,31,32,34,36,37,42,45,51,52,54,55,60,63,66,68,
                69,71,76,81,83,84,85,86,87,94,97,99,106,107,110,113,114,115,118,120,121,125,134,136,137,138,142,143,147,
                150,152,159,160,161,165,166,174,176,178,186,187,189,190,191,195,196,198,204,212,216,217,220,221,222,225,
                227,229,232,237,239,242,245,251,263,264,274,275,276,277};



        int i = 0;
        int j = input.length - 1;
        int target = 286;
        int index = findTarget(i, j, input, 0, j, target, j/2);
        System.out.println(index);
    }

    public static int findTarget(int i, int j, int[] input, int start, int end, int target, int midPoint) {
        int mid = (i+j)/2;
        System.out.println("A:" +mid);
        if (input[mid] == target){
            System.out.println("B: "+mid);
            return mid;
        }
        else if (mid == start && i != j){
            System.out.println("C: "+mid);
            System.out.println("F: "+(midPoint+1));
            System.out.println("G: "+end);
            System.out.println("H: "+((midPoint+1+end)/2));
            return findTarget(midPoint+1, end, input, midPoint+1, end, target, (midPoint+1+end)/2);
        }
        else if (i == j){
            return -1;
        }
        else if (input[mid] > target){
            System.out.println("D: "+mid);
            return findTarget(i, mid, input, start, end, target, midPoint);
        }
        else{

            return findTarget(mid + 1, j, input, start, end, target, midPoint);
        }
    }
}
