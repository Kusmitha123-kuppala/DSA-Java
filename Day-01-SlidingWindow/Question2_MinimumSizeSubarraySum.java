/**
 * LeetCode 209 - Minimum Size Subarray Sum
 *
 * Pattern: Variable Sliding Window
 *
 * Problem:
 * Given an array of positive integers nums and a positive integer target,
 * return the minimum length of a contiguous subarray whose sum is
 * greater than or equal to target.
 * If no such subarray exists, return 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 public class Question2_MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
