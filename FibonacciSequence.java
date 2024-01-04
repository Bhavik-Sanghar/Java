public class FibonacciSequence {

    public static void generateFibonacci(int n) {
        // Your code here
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
      for(int i = 2 ; i <= n ; i++){
        int x = a+b;

        System.out.print(x+ " ");

        a = b;
        b = x;
      }
    }

    public static int calculateFibonacciSum(int n) {
      if (n <= 0) {
          return 0;
      }
  
      int a = 0;
      int b = 1;
      int sum = 1;
  
      for (int i = 2; i <= n; i++) {
          int x = a + b;
          sum += x;
  
          a = b;
          b = x;
      }
  
      return sum;
  }

    public static void main(String[] args) {
        int n = 5; // You can change this to any positive integer

        System.out.print("Fibonacci sequence up to " + n + ": ");
        generateFibonacci(n);
        System.out.println("");
        System.out.println("Sum of the first " + n + " Fibonacci terms: " + calculateFibonacciSum(n));

    }
}
