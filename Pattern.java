public class Pattern {

    public static void tri(int n) {
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int x = 5;
        tri(x);
    }
}
