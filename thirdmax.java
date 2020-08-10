public class thirdmax {

    public static void main(String[] args){
        int[] nums = {5, Integer.MIN_VALUE, Integer.MIN_VALUE};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] threes = new int[3];
        for (int i = 0; i < threes.length; i++){
            threes[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < nums.length; i++){
            boolean firstCarry = false;
            boolean secondCarry = false;
            boolean equality = false;
            int temp = 0;
            int anotherTemp = 0;
            if (nums[i] > threes[0]){
                System.out.println("A");
                temp = threes[0];
                threes[0] = nums[i];
                firstCarry = true;
            }
            else if (nums[i] == threes[0]){
                System.out.println("B");
                equality = true;
            }
            else{
                System.out.println("C");
                firstCarry = false;
            }

            if (firstCarry){
                if (temp > threes[1]){
                    System.out.println("D");
                    anotherTemp = threes[1];
                    threes[1] = temp;
                    secondCarry = true;
                }
                else{
                    System.out.println("E");
                    secondCarry = false;
                }
            }
            else if (nums[i] > threes[1] && !equality){
                System.out.println("F");
                secondCarry = true;
                anotherTemp = threes[1];
                threes[1] = nums[i];
            }
            else if (nums[i] == threes[1]){
                System.out.println("G");
                equality = true;
            }

            if (!equality) {
                if (secondCarry) {
                    if (anotherTemp > threes[2]) {
                        System.out.println("H");
                        threes[2] = anotherTemp;
                    }
                } else if (!firstCarry) {
                    if (nums[i] > threes[2]) {
                        System.out.println("I");
                        threes[2] = nums[i];
                    }
                }
            }
        }

        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == Integer.MIN_VALUE){
                counter++;
                break;
            }
        }
        if (counter == 0 && threes[2] == Integer.MIN_VALUE){
            return threes[0];
        }
        if (counter == 1 && threes[0] != Integer.MIN_VALUE){
            return threes[0];
        }
        return threes[2];
    }
}
