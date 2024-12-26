package com.LeetCode.Recursion;

public class CountSubarraysOfThree {

    public static void main(String[] args) {
        int[] nums = {-1,-4,-1,4};
        System.out.println(countSubarrays(nums));
    }

    private static int countSubarrays(int[] nums) {
        int first = 0;
        int second = 1;
        int third = 2;
        int sum = 0;
        while (third < nums.length) {
            double secondHalf = ((double) nums[second] / 2);
            if ((nums[first] + nums[third]) == secondHalf) {
                sum++;
                System.out.println("first = " + nums[first]);
                System.out.println("second = " + nums[second]);
                System.out.println("third = " + nums[third]);
            }
            first++;
            second++;
            third++;
        }
        return sum;
    }
}
