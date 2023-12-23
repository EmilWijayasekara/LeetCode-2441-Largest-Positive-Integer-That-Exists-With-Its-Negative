

# LeetCode Practice  (Day 8)

## About the problem
- *Problem Number* : 2441
- *Problem Name* :  [Largest Positive Integer That Exists With Its Negative](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/ "https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/")
- *Problem difficulty* : Easy (67.85%)🟢
- *Programming language used* - Java

## Problem


Given an integer array  `nums`  that  **does not contain**  any zeros, find  **the largest positive**  integer  `k`  such that  `-k`  also exists in the array.

Return  _the positive integer_ `k`. If there is no such integer, return  `-1`.

**Example 1:**

```
Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.
```

**Example 2:**

```
Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
```

**Example 3:**

```
Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.
```

**Constraints:**

-   `1 <= nums.length <= 1000`
-   `-1000 <= nums[i] <= 1000`
-   `nums[i] != 0`

## Approach Explanation

#### This solution needs to be optimized.!!! (brute-force approach)
In approaching the problem, I iterated through the given array and focused on positive numbers, aiming to find the largest positive integer `k` such that its negative counterpart `-k` exists in the array. To achieve this, I checked for each positive number whether its corresponding negative value was present. I did a conditional check to update the maximum valid k when a positive number and its corresponding negative counterpart were found. However, This, solution attempts to handle the core logic of identifying the largest valid k and returns it as the final result, or -1 if no such integer exists in the array.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
