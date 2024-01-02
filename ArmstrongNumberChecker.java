public class ArmstrongNumberChecker {

    public static boolean isArmstrongNumber(int number) {
        // Your code here
        int x = 0;
        int temp = number;
        int ans = number;
        while(number != 0 ){
            number /=10;
            x++;
        }
        double sum = 0 ;
        while (temp != 0) {
            int rem = temp % 10;
            temp /=10;
            sum  = sum + Math.pow(rem, x); 
        }
        if(sum == ans ){
            return true;
        }
        return false;
       
    }

    public static void main(String[] args) {
        int armstrongNumber = 153;
        int nonArmstrongNumber = 123;

        System.out.println(armstrongNumber + " is Armstrong? " + isArmstrongNumber(armstrongNumber));
        System.out.println(nonArmstrongNumber + " is Armstrong? " + isArmstrongNumber(nonArmstrongNumber));
    }
}
