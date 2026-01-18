class Solution {
    public int[] twoSum(int[] num, int target) {
        // left -> Pointer at the starting of the array
        int left = 0;
        // right -> Pointer at the last of the array
        int right = num.length-1;
        // Making sure pointers does not cross each other
        while(left < right){
            int sum = num[left]+num[right];
            if(sum > target){
                right--;
            }else if(sum == target){
                return new int[] {left+1, right+1};
            }else{
                left++;
            }
        // return empty array if no valid pair is found 
        }return new int[] {};

            
    }
}