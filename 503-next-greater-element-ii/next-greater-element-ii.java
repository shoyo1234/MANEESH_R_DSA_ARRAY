class Solution {
    public int[] nextGreaterElements(int[] nums){
        int size = nums.length;
        int result[] = new int[size];
        Deque<Integer> stack = new ArrayDeque<>();
        // We traverse the array twice (from 2*size - 1 to 0)
        // Behaves like a circular array
        for(int i = 2*size-1; i >= 0; i--){
            int index = i % size;
            int current = nums[index];
            while(stack.size() > 0 && current >= stack.peek()){
                stack.pop();
            }
            //Only store elements in second pass as the index lies in the correct range (original array)
            if(i < size){
                result[index] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(current);
        }
        return result;
    }
}