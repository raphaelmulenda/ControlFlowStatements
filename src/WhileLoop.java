public class WhileLoop {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        int count = 0;
        int finalNumber = 20;
        while (number <= finalNumber){
            if(!isEvenNumber(number)){
                number++;
                //continue;
            }
            else {
                System.out.println("Even number " + number);
                sum += number;
                count++;
                number++;
                if (count == 5){
                    System.out.println("The sum of Even Number is " + sum + "and the count is " + count);
                    break;
                }

            }
        }
    }
    public static boolean isEvenNumber(int number) {
        return ( number % 2 == 0);

    }
}
