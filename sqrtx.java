public class sqrtx {

    public static void main(String[] args){
        int num = 101;
        int newVal = dappy(0, 46339, num);
        System.out.println(newVal);
    }

    public static int dappy(int start, int end, int num) {
        int endPlusOne = end + 1;
        if (num >= (end * end) && num < (endPlusOne * endPlusOne)){
            return end;
        }
        else if (num == (end * end)){
            return  end;
        }
        else if (num < (end * end)){
            System.out.println("A: "+(start+end)/2);
            return dappy(start, (start+end)/2, num);
        }
        else{
            System.out.println("B: "+(start+end)/2);
            return dappy(end, end + (end/2),  num);
        }
    }
}
