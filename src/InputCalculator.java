import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while(true){
            System.out.println("Enter number: ");
            boolean isValidNum = scanner.hasNextInt();

            if (isValidNum){
                int number = scanner.nextInt();
                sum += number;
                count +=1;
                average = (long) Math.round(sum/count);

            }
            else { break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " +average);
        scanner.close();


    }
}
