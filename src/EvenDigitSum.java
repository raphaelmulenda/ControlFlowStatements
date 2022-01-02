public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int i = 0;
        Integer num = number;

        if ( number >=0){
            while ( number > 0){
                int digit = number % 10;
                if  (digit % 2 == 0) {
                    sum += digit;


                }
                number /= 10;

            }
            System.out.println("The sum of Even digits from the given number " + num + " = " + sum);
            return sum;
        }
        return -1;
    }
}
