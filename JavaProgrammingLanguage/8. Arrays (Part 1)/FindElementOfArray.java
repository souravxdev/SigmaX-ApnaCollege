public class FindElementOfArray {

    public static int linearSearch(int[] numbers, int key) {
        // Linear Search: Find the index of element in a given array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}

// Time Complexity is proportional to loop.
// Time Complexity of Linear Search: O(n).
