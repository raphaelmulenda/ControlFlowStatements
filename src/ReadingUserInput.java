import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int i = 0;

        while (i != 10) {
            System.out.println("Enter number #" + (counter + 1));
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                i++;
                counter += 1;
            }
            else {
                System.out.println("Invalid Number Entered!");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of all valid 10 number entered is: " + sum);
        scanner.close();
    }
}
