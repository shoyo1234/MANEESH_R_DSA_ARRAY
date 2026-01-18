class Solution {
    public int missingNumber(int[] nums) {
        // n -> Total numbers of the array 
        int n = nums.length;
        // sum_of_n -> Sum of first n natural numbers   
        int sum_of_n = n*(n+1)/2;

        int sum = 0; 
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        // Difference gives the natural number
        int missing_number = sum_of_n - sum;
        
        return missing_number;
        
    }
}