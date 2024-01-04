public class FactorialCalculator {

    public static int calculateFactorial(int n) {
        // Your code here
        if(n <1){
            return 1;
        }
        return n * calculateFactorial(n-1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        System.out.println("Factorial of " + num1 + ": " + calculateFactorial(num1));
        System.out.println("Factorial of " + num2 + ": " + calculateFactorial(num2));
    }
}
