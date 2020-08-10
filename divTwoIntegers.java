public class divTwoIntegers {

    public static void main(String[] args){
        int dividend = 2147483647;
        int divisor = 3;
        int count = 1;
        int number = 0;
        //for (int i = 4; i < 1000; i++) {
            //int quotient = answer(i, divisor, count, divisor, number);
           // System.out.println("i: "+i+" : " +quotient);
        //}
        long quotient = answer(dividend, divisor, count, divisor, number);
        System.out.println(quotient);
    }

    public static long answer(long dividend, long divisor, long count, long original, long number) {
        long value = divisor << 1;
        System.out.println("A: "+value);
        if (value < dividend){
            System.out.println("B: "+(count << 1));
            return answer(dividend, value, (count<<1), original, number);
        }
        else if (value == dividend){
            return number + (count<<1);
        }
        else if (dividend - divisor < original){
            System.out.println("C: "+number);
            return number+count;
        }
        else{
            System.out.println("D: "+(dividend-divisor));
            System.out.println("E: "+count);
            return answer(dividend - divisor, original, 1, original, number+count);
        }
    }
}
