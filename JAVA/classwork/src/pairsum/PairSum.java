package pairsum;

public class PairSum {
    public static int countPairsWithSum(int[] arr, int sum) {
        int count = 0;

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // For each element, iterate through the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                // If the sum of current pair equals the target sum, increment count
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }
}
