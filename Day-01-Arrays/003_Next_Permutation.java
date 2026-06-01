import java.util.*;

class Solution {

    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Find pivot
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Find next greater element
        if(i >= 0) {

            int j = nums.length - 1;

            while(nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Reverse right half
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int start, int end) {

        while(start < end) {

            swap(nums, start, end);

            start++;
            end--;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        Solution obj = new Solution();

        obj.nextPermutation(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}