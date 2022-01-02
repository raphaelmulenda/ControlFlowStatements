public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-1221);
    }
    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        Integer num = number;
        while (number !=0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit ;
            number /= 10;

        }
        if(reverseNumber == num) {
            System.out.println("It's a palindrome");
            return true;
        } else{

            System.out.println("Not a palindrome");
            return false;
        }

    }
}
