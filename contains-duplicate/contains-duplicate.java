class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    Set<Integer> st = new HashSet<>();
    for(int val : nums) {
        if(st.contains(val)) { return true;}
        st.add(val);
    }
        return false;
    }
}


  // {
    //     // brute force approach
    //     for(int i=0; i<nums.length ; i++) {
    //         for(int j=i+1 ; j<nums.length ; j++) {
    //             if(nums[i] == nums[j]) return true;
    //         }
    //     }
    //     return false;
    // }