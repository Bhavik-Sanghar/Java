public class MinMaxArray {

    public static int findMaxElement(int[] array) {
        // Your code here
        int max = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    
    public static int findMinElement(int[] array) {
        // Your code here
        int min = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 9, 2, 7, 5};
        int[] array2 = {-1, -5, -3, -8, -2};

        System.out.println("Maximum element in array1: " + findMaxElement(array1) + " Minimum element in array1: " +findMinElement(array1));
        System.out.println("Maximum element in array2: " + findMaxElement(array2));
    }
}
