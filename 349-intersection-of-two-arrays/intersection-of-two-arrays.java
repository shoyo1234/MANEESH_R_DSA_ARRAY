class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Set to store unique elements of  array 1
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        // To store intersection array
        List<Integer> result = new ArrayList<>();
        for(int nums : nums2){
            if(set.remove(nums)){
                result.add(nums);
            }
        }
        int[] result_array = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            result_array[i] = result.get(i);
        }
        return result_array;
        
    }
}