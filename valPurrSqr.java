public class valPurrSqr {

    public static void main(String[] args){
        int num = 899;
        int h = 0;
        int i = 46340;
        boolean newVal = pS(h, i, num);
        System.out.println(newVal);
    }

    public static boolean pS(int h, int i, int num) {
        if (h == i){
            System.out.println("Did not find");
            return false;
        }
        int a = i * i;
        System.out.println("Square: "+a);
        if (a == num){
            System.out.println("Found it");
            return true;
        }
        else if (a > num){
            System.out.println("A: "+h+" "+((h+i)/2)+" "+num);
            return pS(h, (h + i)/2, num);
        }
        else if (a < num){
            System.out.println("B: "+i+" "+(i + (i/2))+" "+num);
            int x = 0;
            if (i > 23470){
                x = 46340;
            }
            else{
                x = i + (i/2);
            }
            return pS(i, x, num);
        }
        return false;
    }
}
