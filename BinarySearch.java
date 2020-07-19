class Solution {
    public int search(int[] nums, int target) {

        int index = -1;
        int left = 1;
        int right = nums.length;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid-1] == target){
                index = mid-1;
                break;
            }
            if(target > nums[mid-1]){
                left = mid + 1;
            }
            if(target < nums[mid-1]){
                right = mid - 1;
            }
        }

        return index;
    }
}

/***

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

Note:

You may assume that all elements in nums are unique.
n will be in the range [1, 10000].
The value of each element in nums will be in the range [-9999, 9999].

***/
