/*
https://leetcode.com/problems/sort-colors/description/
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
*/

import java.util.Arrays;

public class Main {
    public static void sortColors(int[] nums) {
        int tmp = 0;
        System.out.println("Before editing the array");
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length ; i++ ){
            try {
                if (nums[i] <= nums[i+1]){
                    // There is no need to do anything here
                }else{
                    tmp = nums[i];
                    nums[i] = nums [i+1];
                    nums[i+1]=tmp;
                }
            }catch (Exception e) {
                // outOfBound
            }
        }
        System.out.println("After editing the array");
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) throws Exception { 
        int[] numsArray = {0, 3, 0, 2, 0, 1, 2};
        sortColors(numsArray);
    }    
}
