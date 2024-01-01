import java.util.ArrayList;

public class Bubble {

    public static void bub(int[] inp){
        // ArrayList<Integer> ans = new ArrayList<Integer>();
        int a = inp.length;
        for(int i = 0 ; i < a ; i++ ){
            for(int j = i+1 ; j < a ; j++){
               if(inp[i] > inp[j]){
                int temp = inp[i];
                inp[i] = inp[j];
                inp[j] = temp;
               }
            }
        }
        for(int x = 0 ; x < inp.length ; x++){
            System.out.print(inp[x] + " ");
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hello");
        int[] a = {74, 45,46, 56 ,22};
        // System.out.println(bub(a));
        bub(a);
    }
}
