package Day2;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // Maximum product can be either from the three largest numbers
        // or from the two smallest (negative) numbers and the largest number.
        int max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int max2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(max1, max2);
    }
}

