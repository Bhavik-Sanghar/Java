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

    public static void main(String[] args) {
        int n = 10; // You can change this to any positive integer

        System.out.println("Fibonacci sequence up to " + n + ":");
        generateFibonacci(n);
    }
}
