import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int[] array, int steps) {
        // Your code here
        int[] copy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + steps) % array.length;
            array[newIndex] = copy[i];
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        rotateArray(array, steps);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}
