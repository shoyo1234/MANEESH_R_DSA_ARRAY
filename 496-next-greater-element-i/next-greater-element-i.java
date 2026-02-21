class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map stores the values and its next greatest number 
        Map<Integer, Integer> map = new HashMap<>();
        //Stores the next immediate greater element
        Stack<Integer> stack = new Stack<>();
        /*Iterating from right because the problem asks for the next 
        greater element on the right side of each element.*/
        for(int i = nums2.length-1; i >= 0; i--){
            int last_value = nums2[i];
            //Remove elements smaller than or equal to current value
            while(stack.size() > 0 && stack.peek() <= last_value){
                stack.pop();
            }
            //If stack is empty no greater element exists on the right
            if(stack.isEmpty()){
                map.put(last_value, -1);
            }else{
                map.put(last_value, stack.peek());
            }
            stack.push(last_value);
        }
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}