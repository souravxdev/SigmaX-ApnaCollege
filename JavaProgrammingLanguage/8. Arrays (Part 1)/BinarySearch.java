public class BinarySearch {

    public static int binarySearch(int[] numbers, int key) {
        // Binary Search: Prerequisite - sorted array

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] > key) {
                // left side: 1st half
                end = mid - 1;
            } else if (numbers[mid] < key) {
                // right side: 2nd half
                start = mid + 1;
            } else {
                // numbers[mid] == key
                return mid;
            }
        }
        return -1; // Not Found
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 10, 12, 14 };
        int key = 10;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}

// Time Complexity for Binary Search: O(log n) - Logarithmic Time Complexity
