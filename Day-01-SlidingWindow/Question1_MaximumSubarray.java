
/**
 * LeetCode 53 - Maximum Subarray
 *
 * Pattern: Kadane's Algorithm
 *
 * Problem:
 * Given an integer array nums, find the contiguous subarray
 * with the largest sum and return that sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Question1_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        // Initialize both variables with the first element
        int currentSum = nums[0];
        int maxSum = nums[0];
        // Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {
            // Either start a new subarray or extend the previous one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int answer = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + answer);
    }
}