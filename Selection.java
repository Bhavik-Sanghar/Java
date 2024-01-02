public class Selection {
    public static void sel(int arr[]) {
        for(int i = 0 ; i < arr.length-1 ; i++) {
            int small = i;
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[j] < arr[small]) {
                    small = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {50 , 60 , 45 ,22 , 15};
        sel(a);

        // Print the sorted array
        for(int i = 0 ; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
