import java.util.ArrayList;

class Test {
    public static int Coin(ArrayList<Integer> list, int target) {
        int ans = 0;
        list.sort(null);

        for (int i = list.size() - 1; i >= 0; i--) {
            int coin = list.get(i);

            while (target >= coin) {
                target -= coin;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(5);
        A.add(10);
        int x = 27;
        System.out.println(Coin(A, x));
    }
}
