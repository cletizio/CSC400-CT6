public class ArraySortAscending {
    public static boolean isSortedAscending(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr.length <= 1) {
            return true;
        }

        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Compare the current element with the next element
            if (arr[i] > arr[i + 1]) {
                // If any element is greater than its next neighbor, the array is not sorted
                return false;
            }
        }

        // If the loop completes without returning false, the array is sorted
        return true;
    }
}
