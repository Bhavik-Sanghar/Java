public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (max + min) / 2;

            if (target == array[mid]) {
                return mid;
            } else if (array[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target1 = 5;
        int target2 = 11;

        System.out.println("Index of " + target1 + ": " + binarySearch(sortedArray, target1));
        System.out.println("Index of " + target2 + ": " + binarySearch(sortedArray, target2));
    }
}
