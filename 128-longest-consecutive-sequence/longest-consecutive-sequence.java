class Solution {
    public int longestConsecutive(int[] nums) {
        //HashSet datastructure for O(1) lookups when checking consecutive numbers
        Set<Integer> arr = new HashSet<>();
        //Duplicates gets removed
        for(int num : nums){
            arr.add(num);
        }
        int longest_cons_arr = 0;
        //Iterate through each element in arr set
        for(int num : arr){
            if(!arr.contains(num-1)){
                int count = 0;
                int current = num;
                //Counting the sequence length
                while(arr.contains(current)){
                    current++;
                    count++;
                }//Update the longest sequence
                if(count>longest_cons_arr){
                    longest_cons_arr = count;
                }
            }
        }
        return longest_cons_arr;


        
    }
}