class Solution {
    public int longestOnes(int[] nums, int k) {
        //left and right are pointers used to construct the window
        int left = 0;
        //stores the max length of subarray
        int max_length = 0;
        //Used to check whether the zeros count exceeds k 
        int zeros_count = 0;
        for(int right = 0; right < nums.length; right++){
            //if 0 spotted increase the count of zeros 
            if(nums[right] == 0){
                zeros_count = zeros_count+1;
            }
            //when zero count exceeds k move left, if arr[left] is zero reduce the count of zero 
            while(zeros_count > k){
                if(nums[left] == 0){
                    zeros_count = zeros_count-1;
                }
                left++;
            }
            //valid subarray length is stored
            int current_length = right-left+1;
            max_length = Math.max(max_length, current_length);
        }
        return max_length;

    }
}