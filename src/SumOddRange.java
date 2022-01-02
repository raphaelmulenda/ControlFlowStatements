public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            return ( number % 2 != 0);
        }
        System.out.println(false);
        return false;

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start > 0 && end > 0) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    int results = sum + i;
                    return results;

                }
            }
            return -1;
        }
        return -1;
    }
}
