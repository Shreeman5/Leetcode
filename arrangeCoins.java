public class arrangeCoins {

    public static void main(String[] args){
        int num = 1804289383;
        int newVal = gauss(0, 65535, num);
        System.out.println(newVal);
    }

    public static int gauss(int i, int j, int num) {
        double lowerLimit =  ((j * 1.0)/2) * (j + 1);
        System.out.println("low: "+lowerLimit);
        double upperLimit;
        if (j < 65535){
            int a = j + 1;
            upperLimit = ((a * 1.0)/2) * (a + 1);
        }
        else{
            upperLimit = Integer.MAX_VALUE;
        }
        System.out.println("upp: "+upperLimit);
        int mid = (i+j)/2;
        System.out.println("mid: "+mid);
        if (num == lowerLimit){
            return j;
        }
        else if (num == upperLimit){
            return j + 1;
        }
        else if (num > lowerLimit && num < upperLimit){
            return j;
        }
        else if (num < lowerLimit){
            System.out.println("A: "+i+" "+j);

            return gauss(i, mid, num);
        }
        else{
            System.out.println("B");
            int a  = j + (j/2);
            if (j > 65535){
                a = 65535;
            }
            return gauss(j, a, num);
        }
    }
}
