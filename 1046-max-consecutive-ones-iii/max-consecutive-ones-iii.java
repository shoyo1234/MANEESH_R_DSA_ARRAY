class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // spend one flip if we see a zero
            if (nums[right] == 0) {
                k--;
            }

            // if flips exceeded, shrink from left
            if (k < 0) {
                if (nums[left] == 0) {
                    k++; // refund flip
                }
                left++;
            }
        }

        // final window size
        return nums.length - left;
    }
}