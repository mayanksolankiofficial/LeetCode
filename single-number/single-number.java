class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hash = new HashMap<>(); // create 
        for(int i=0 ; i<nums.length ; i++) {
            hash.put(nums[i] , hash.getOrDefault(nums[i],0) +1); // put 
        }
        
        for(int ans : hash.keySet()) {
            if(hash.get(ans)==1) {return ans;}  // this is our answer   
        }
        return -1;
    }
}
                    
/**
Intuition- HashMap 

3 1 4 2 7 <-- custom array elements
3 1 3 1 2 
3 3 3 3 3

0 1 2 3 4 <--index

*/