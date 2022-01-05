import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minNum = 0;
        double maxNum = 0;

        while (true){
            System.out.println("Enter number: ");
            boolean isValidNum = scanner.hasNextDouble();

            if (isValidNum){
                double number = scanner.nextDouble();
                if ((number > minNum && number > maxNum) && (minNum ==0 && maxNum ==0)){
                    maxNum = number;
                    System.out.println("Max Value is: " + maxNum);

                }
                if ((number > minNum && number > maxNum) && (minNum ==0 && maxNum !=0)){
                    minNum = maxNum;
                    maxNum = number;
                    System.out.println("Max Value is: " + maxNum + " and Min Value is: " + minNum);

                }
                if (number > minNum && number > maxNum){
                    maxNum = number;
                    System.out.println("Max Value is: " + maxNum);
                }
                else if (((number < maxNum) && (minNum ==0)) || (number <=minNum) ){
                    minNum = number;
                    System.out.println("Min Value is: " + minNum);
                }
            }
            else {
                //System.out.println("Min value is " + minNum + "and Max value is: " + maxNum);
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min value is " + minNum + " and Max value is: " + maxNum);
        scanner.close();
    }

}
