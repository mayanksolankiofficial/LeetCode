class Solution {
    public void rotate(int[] nums, int k) {
        
        // mayank bring it on
        k = k % nums.length;
        reverse(nums , 0 , nums.length-k-1); // lp
        reverse(nums , nums.length -k , nums.length-1); // rp
        reverse(nums , 0 , nums.length-1); // all
        
    }
    
    // helper method
    public void reverse(int[] nums, int i, int j) {
        
        int lp=i;
        int rp = j;
        while(lp < rp) {
         int temp = nums[lp];
            nums[lp]= nums[rp];
            nums[rp] = temp; 
            
            lp++; rp--;
        }
    }

}







/**
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

k=2
a b c d e <--Input elements 
0 1 2 3 4 <--indexing 
d e a b c <--Output element array

0, length-k-1 // left part 
length-k, length-1 // right part 

*/
