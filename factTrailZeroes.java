public class factTrailZeroes {

    public static void main(String[] args){
        int s = 50;
        int lengthLW = fTZ(s);
        System.out.println(lengthLW);
    }

    public static int fTZ(int n) {
        int trail = -1;
        int i = 0;
        while (i <= n){
            if (i % 1220703125 == 0 && i != 0){
                trail += 12;
            }
            else if (i % 244140625 == 0 && i != 0){
                trail += 11;
            }
            else if (i % 48828125 == 0 && i != 0){
                trail += 10;
            }
            else if (i % 9765625 == 0 && i != 0){
                trail += 9;
            }
            else if (i % 1953125 == 0 && i != 0){
                trail += 8;
            }
            else if (i % 390625 == 0 && i != 0){
                trail += 7;
            }
            else if (i % 78125 == 0 && i != 0){
                trail += 6;
            }
            else if (i % 15625 == 0 && i != 0){
                trail += 5;
            }
            else if (i % 3125 == 0 && i != 0){
                trail += 4;
            }
            else if (i % 625 == 0 && i != 0){
                trail += 3;
            }
            else if (i % 125 == 0 && i != 0){
                trail += 2;
            }
            else if (i % 25 == 0 && i != 0){
                trail++;
            }
            trail++;
            i = i + 5;
        }
        return trail;
    }
}
