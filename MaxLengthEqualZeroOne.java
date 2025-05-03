import java.util.HashMap;

public class MaxLengthEqualZeroOne {
    public static int findMaxLength(int[] nums) {
        // HashMap to store the first occurrence of a cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Base case: sum 0 at index -1

        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 to -1 to balance the sum
            sum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                // Calculate the length from previous index to current
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the first occurrence of the cumulative sum
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 1, 0};
        int result = findMaxLength(nums);
        System.out.println("Maximum length: " + result);
    }
}
