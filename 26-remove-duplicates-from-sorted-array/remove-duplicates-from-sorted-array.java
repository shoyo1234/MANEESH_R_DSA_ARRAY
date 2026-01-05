class Solution {
    public int removeDuplicates(int[] nums) {
        // j -> It keeps track of the position where the next unique element    should be placed
        int j = 1; 
        // i -> It iterates through the array to find new non-duplicate element
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        // j - represents no of unique elements
        return j;
        
    }
}