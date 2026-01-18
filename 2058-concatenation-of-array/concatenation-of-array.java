class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] n_array = new int[n*2];
        for(int i = 0; i < n; i++){
            n_array[i] = nums[i];
        }
        for(int i = 0; i < n; i++){
            n_array[n+i] = nums[i];
        }
        return n_array;
    
    }
}