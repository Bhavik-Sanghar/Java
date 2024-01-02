public class Bubble {

    public static void bub(int[] inp) {
        int n = inp.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (inp[j] > inp[j + 1]) {
                    // Swap if the current element is greater than the next one
                    int temp = inp[j];
                    inp[j] = inp[j + 1];
                    inp[j + 1] = temp;
                }
            }
        }

        for (int x = 0; x < inp.length; x++) {
            System.out.print(inp[x] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {74, 45, 46, 56, 22};
        bub(a);
    }
}
