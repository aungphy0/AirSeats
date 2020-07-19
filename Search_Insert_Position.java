class Solution {
    public int searchInsert(int[] nums, int target) {

        int result = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }

        if(list.contains(target)){
            result = list.indexOf(target);
        }else{
            list.add(target);
            Collections.sort(list);
            result = list.indexOf(target);
        }

        return result;
    }
}

/***

Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0

***/
