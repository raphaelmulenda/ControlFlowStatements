public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if ((numOne < 10 || numOne > 99) || (numTwo > 10 || numTwo > 99)) {
            System.out.println("false");
            return false;
        }

            while (numOne != 0) {

                int digitNumOne = numOne % 10;
                numOne /= 10;

            while (numTwo != 0) {
                if ((numTwo % 10) == digitNumOne) {
                    System.out.println("The digit " + digitNumOne + " appears in both");
                    return true;
                }
                numTwo /= 10;
            }

        }
     return false;

    }
}

