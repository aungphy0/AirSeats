class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List< List<Integer> > result = new ArrayList();
        Set< List<Integer> > set = new HashSet();

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            int left = i + 1;
            int right = nums.length-1;

            while(left < right){

                List<Integer> ls = new ArrayList();

                if(nums[i] + nums[left] + nums[right] == 0){
                    ls.add(nums[i]);
                    ls.add(nums[left]);
                    ls.add(nums[right]);

                    if(!set.contains(ls)){
                        set.add(ls);
                        result.add(ls);
                    }

                    right--;

                }else{
                    if(nums[i] + nums[left] + nums[right] > 0){
                        right--;
                    }else{
                        left++;
                    }

                }
            }

        }

        return result;
    }
}

/***
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
***/
