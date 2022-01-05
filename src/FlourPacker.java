public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigFlourBag = 5;
        int smallFlourBag = 1;
        int sum = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("Invalid Value");
            return false;
        }
            if ((bigCount * bigFlourBag) <= goal) {
                sum = bigCount * bigFlourBag;
                if (sum == goal) {
                    System.out.println(bigCount + " * " + bigFlourBag + " = " + goal);
                    return true;
                }
            }

            return (smallCount >= (goal-sum));
    }
}