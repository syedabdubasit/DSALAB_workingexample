public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        reverseArray(originalArray);
        
        System.out.print("Reversed Array: ");
        printArray(originalArray);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}