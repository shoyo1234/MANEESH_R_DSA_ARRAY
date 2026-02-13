class Solution {
    public int calPoints(String[] operations){

        // Stack to keep track of valid scores
        Stack<Integer> stack = new Stack<>();

        for(String op : operations){

            if(op.equals("C")){
                // Remove the last valid score
                stack.pop();
            }
            else if(op.equals("D")){
                // Double the last score and add it
                stack.push(2 * stack.peek());
            }
            else if(op.equals("+")){
                // Add last two scores
                int last_ele = stack.pop();
                int second_last_ele = stack.peek();
                int newScore = last_ele + second_last_ele;

                // Push back the removed score and the new one
                stack.push(last_ele);
                stack.push(newScore);
            }
            else{
                // Regular number just add to stack
                stack.push(Integer.parseInt(op));
            }
        }

        // Calculate total score
        int sum = 0;
        for(int num : stack){
            sum += num;
        }

        return sum;
    }
}
