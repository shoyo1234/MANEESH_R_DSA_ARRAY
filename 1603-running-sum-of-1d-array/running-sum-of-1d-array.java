class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        // start from the second element of the array
        for(int i = 1; i < n; i++){
            // add the previous sum to the current element
            nums[i] = nums[i-1] + nums[i];
        } 
        // return the modified array
        return nums;       
    }
}