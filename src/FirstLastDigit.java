import java.util.ArrayList;
import java.util.List;

public class FirstLastDigit {
    public static void main(String[] args) {
        sumFirstAndLastDigit(10);
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }
       int lastDigit = number % 10;
        //int i = 0;

        for (int i =0; i < number; i++) {
            if (i > 9) {
                number /= 10;
            }
        }
        System.out.println("The sum pf first digit and last " + number + " + " + lastDigit + " = " + (number + lastDigit ));
        return (number + lastDigit );


        }

}
