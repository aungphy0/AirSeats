class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int [] arr = new int[2]; 
         
        
        List<Integer> ls = new ArrayList<Integer>(); 
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
               ls.add(i);  
            } 
        }
        
        //int [] arr = new int[ls.size()];
        
        if(ls.isEmpty()){
            arr[0] = -1;
            arr[1] = -1;
        }else if(ls.size() == 1){
            arr[0] = ls.get(0); 
            arr[1] = ls.get(0); 
        }else{
            arr[0] = ls.get(0);
            arr[1] = ls.get(ls.size() - 1); 
        }
         
        return arr; 
    }
}
