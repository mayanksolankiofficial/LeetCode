class Solution {
    public int removeDuplicates(int[] nums) {
        
     if(nums.length==1) {return 1;}   
        
     int left= 0;
        
     for(int right= 1 ; right <nums.length ; right++) 
     {
        if(nums[left] != nums[right]) {
            nums[++left] = nums[right];
        }    
     }
        return ++left;
    }
}