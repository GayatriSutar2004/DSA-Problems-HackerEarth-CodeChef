public class RecursiveBubbleSort {

    // Recursive function to sort array
    static void bubbleSort(int[] arr, int n) {
        // Base case: array of size 1 is already sorted
        if (n == 1) {
            return;
        }

        // One full pass to push the largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call on the reduced array
        bubbleSort(arr, n - 1);
    }

    // Utility method to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        bubbleSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
