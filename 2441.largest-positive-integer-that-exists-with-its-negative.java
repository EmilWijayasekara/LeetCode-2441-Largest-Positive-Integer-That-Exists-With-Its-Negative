/*
 * @lc app=leetcode id=2441 lang=java
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

// @lc code=start
class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        for (int i = 0; i < nums.length; i++) { //iterating through array
            if(nums[i]>0){ //filtering out positive numbers
                for (int j = 0; j < nums.length; j++) {
                    if(nums[j]==(nums[i]-2*nums[i])){ //finding the maximum number that have minus values
                        if(nums[i]>=max){
                            max=nums[i]; //updating the max
                        }
                    }
                }
            }
        }
        return max;
    }
}
// @lc code=end

