// Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1; // The first element is always unique
        int j = 1; // Pointer for placing the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current number is different from the previous one
                nums[j] = nums[i]; // Place the unique element at index j
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Example input
        int uniqueCount = solution.removeDuplicates(nums);

        System.out.println("Unique count: " + uniqueCount);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount)));
    }
}
