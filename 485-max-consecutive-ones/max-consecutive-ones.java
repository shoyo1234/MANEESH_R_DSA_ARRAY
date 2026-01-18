class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_occ_1 = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
            if(count > max_occ_1){
                max_occ_1 = count;
            }
        }
        return max_occ_1;        
        
    }
}