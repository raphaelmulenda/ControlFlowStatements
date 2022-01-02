public class DigitSumChallenge {
    public static void main(String[] args) {
       // recursion(123456);
        sumDigits(125);
    }
        public static void recursion(int num) {
            int y =0;
            String number = String.valueOf(num);
            for(int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                y+=j;
                System.out.println("digit: " + j);
                System.out.println(y);
            }

        }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int i = 0;
            int sum = 0;
            String num = String.valueOf(number);
            while ( i < num.length()){
                int singleNumber = Character.digit(num.charAt(i),10);
                sum += singleNumber;
                i++;
            }
            System.out.println("The sum of digits is " + sum);
        }
        return -1;

    }

    }

