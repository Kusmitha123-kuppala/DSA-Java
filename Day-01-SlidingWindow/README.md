# Day 1 - Sliding Window
1. LeetCode 53 - Maximum Subarray
- Difficulty: Easy
- Pattern: Kadane's Algorithm

 2. LeetCode 209 - Minimum Size Subarray Sum
- Difficulty: Medium
- Pattern: Variable Sliding Window
---

=> I Learned:
# 1. Kadane's Algorithm
- Used to find the maximum sum of a contiguous subarray.
- At each element, decide whether to:
  - Start a new subarray.
  - Continue the current subarray.
- Time Complexity: [O(n)]
- Space Complexity: [O(1)]

# 2. Variable Sliding Window
- Used when the window size is not fixed.
- Expand the window by moving the right pointer.
- Shrink the window by moving the left pointer when the condition is satisfied.
- Helps solve minimum/maximum length subarray problems efficiently.
- Time Complexity: [O(n)]
- Space Complexity: [O(1)]

---

## Pattern Recognition
Use **Sliding Window** when:
- The problem involves a **contiguous subarray** or **substring**.
- You need the **minimum** or **maximum** window length.
- The array contains **positive numbers**.
- You need to find a window with a given **sum** or **condition**.
---

## Key Concepts
- Two Pointers (`left` and `right`)
- Window Expansion
- Window Shrinking
- Running Sum
- Contiguous Subarray
---

## Files
1. MaximumSubarray.java
2. MinimumSizeSubarraySum.java
---

## Today's Takeaway
Today I learned how to:
- Identify contiguous subarray problems.
- Use Kadane's Algorithm for maximum subarray sum.
- Apply the Variable Sliding Window technique.
- Solve array problems in linear time [O(n)].

-----
