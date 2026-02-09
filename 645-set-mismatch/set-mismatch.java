class Solution {
    public int[] findErrorNums(int[] nums) {

        int duplicate = -1;
        int missing = -1;

        // Mark numbers we have seen
        for (int i = 0; i < nums.length; i++) {

            int number = Math.abs(nums[i]);   // current number
            int pos = number - 1;             // index it should map to

            // If already negative, this number is repeated
            if (nums[pos] < 0) {
                duplicate = number;
            } 
            // Otherwise, mark it as seen
            else {
                nums[pos] = -nums[pos];
            }
        }

        // Find the number that was never marked
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}
