class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result_arr = new int[length];
        // Stack to store index of elements
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = length-1; i>=0; i--){
            // remove lesser or equal days
            int currentTemp = temperatures[i];
            while(!stack.isEmpty() && 
            currentTemp >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result_arr[i] = stack.peek()-i;
            }
            // current days index stored
            stack.push(i);
        }
        return result_arr;
        
    }
}