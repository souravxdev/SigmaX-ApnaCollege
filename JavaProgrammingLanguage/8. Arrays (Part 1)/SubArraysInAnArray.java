public class SubArraysInAnArray {

    public static void printSubArrays(int[] numbers) {
        // A continuous part of an array is called a sub-array. A sub-array is defined
        // by two indices, the starting index and the ending index. The sub-array
        // includes all elements between these two indices, including the elements at
        // the starting and ending indices.
        int totalSubArrays = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + totalSubArrays);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}

// Time Complexity: O(n^3) - The outer loop runs n times, and for each iteration
// of the outer loop, the inner loop runs up to n times, and for each iteration
// of the inner loop, the innermost loop runs up to n times, resulting in a
// cubic time complexity.
