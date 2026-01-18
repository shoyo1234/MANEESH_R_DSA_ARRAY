class Solution {
    public int removeElement(int[] nums, int val) {
        // j -> It tracks the index where next non-val should be placed
        int j = 0;
        // i -> It iterates through every element in the array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        // j - Count of non-val element in array
        return j;
        
    }
}