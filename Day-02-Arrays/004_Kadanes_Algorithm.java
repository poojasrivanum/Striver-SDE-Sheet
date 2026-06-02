/*
Leetcode 53 - Maximum Subarray

Approach:
1. Keep adding elements to current sum.
2. Update maximum sum whenever needed.
3. If current sum becomes negative, reset it to 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {

    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            maxSum = Math.max(maxSum, currentSum);

            // Reset if negative
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Solution obj = new Solution();

        int ans = obj.maxSubArray(nums);

        System.out.println(ans);
    }
}