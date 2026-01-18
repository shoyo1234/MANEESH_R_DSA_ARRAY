class Solution {
    public void moveZeroes(int[] nums) {
        // j -> tracks where the next non-zero element should be placed
        int j = 0;
        for(int i = 0; i < nums.length; i++){
        // i -> scans each element of the array
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        // fill the remaining positions with zeros
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
        
    }
}