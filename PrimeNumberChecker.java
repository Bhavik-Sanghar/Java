public class PrimeNumberChecker {

    public static boolean isPrime(int num) {
        // Your code here
        for(int i = 2 ; i < Math.sqrt(num) ; i++){
            if(num % i  == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int primeNumber = 17;
        int nonPrimeNumber = 15;

        System.out.println("Is " + primeNumber + " a prime number? " + isPrime(primeNumber));
        System.out.println("Is " + nonPrimeNumber + " a prime number? " + isPrime(nonPrimeNumber));
    }
}
