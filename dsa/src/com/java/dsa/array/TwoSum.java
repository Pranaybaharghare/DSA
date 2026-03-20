package com.java.dsa.array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left<right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[]{left, right};
            } else if(sum > target){
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
