public class SumOfDigits {

    public static int calculateSumOfDigits(int number) {
        // Your code here
        int sum = 0;
        while(number != 0){
            int rem = number % 10;
            number = number/10;
            sum = sum + rem;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 4569;

        System.out.println("Sum of digits in " + number1 + ": " + calculateSumOfDigits(number1));
        System.out.println("Sum of digits in " + number2 + ": " + calculateSumOfDigits(number2));
    }
}
