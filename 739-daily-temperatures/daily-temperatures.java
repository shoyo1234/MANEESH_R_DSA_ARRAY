class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result_arr = new int[length];
        // Stack to store index of elements
        Stack<Integer> stack = new Stack<>();

        for(int i = length-1; i>=0; i--){
            // remove lesser or equal days
            while(!stack.isEmpty() && 
            temperatures[i] >= temperatures[stack.peek()]){
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