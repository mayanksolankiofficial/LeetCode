class Solution {
    public void moveZeroes(int[] nums)  {
        
        // Approach : Two pointer(2 loops)        
       int nonZero = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i != nonZero) { 
                int temp = nums[nonZero];
                nums[nonZero] = nums[i];
                nums[i] = temp;
            }
            nonZero++;
        }
    }
    }
}

// o(n)
// O(n)