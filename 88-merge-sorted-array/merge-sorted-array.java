class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i -> points to last valid element in num1
        int i = m-1;
        // j -> points to last element in nums2
        int j = n-1;
        // k -> basically the length of the num1 array
        int k = m+n-1;
        // Merge from the end 
        while(i >=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;    
        }
        //If nums2 still has elements left, copy to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}