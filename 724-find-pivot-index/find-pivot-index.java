class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        
        // Step 1: Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        //Traverse and check pivot condition
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            // Update left sum
            leftSum += nums[i];
        }

        return -1; //no pivot index
    }
}