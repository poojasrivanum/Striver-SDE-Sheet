/*
Leetcode 75 - Sort Colors

Approach:
Dutch National Flag Algorithm

0 -> left side
1 -> middle
2 -> right side

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {

            if(nums[mid] == 0) {

                swap(nums, low, mid);

                low++;
                mid++;
            }

            else if(nums[mid] == 1) {
                mid++;
            }

            else {

                swap(nums, mid, high);

                high--;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        Solution obj = new Solution();

        obj.sortColors(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}