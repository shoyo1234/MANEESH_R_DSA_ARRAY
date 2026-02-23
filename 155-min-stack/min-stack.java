class MinStack {
    // Stack to store all the elements normally
    private Stack<Integer> stack;
    // Stack to keep track of minimum values
    private Stack<Integer> min_Stack;
    //Constructor used to initialize both stacks
    public MinStack() {
        stack = new Stack<>();
        min_Stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(min_Stack.isEmpty() || val <= min_Stack.peek()){
            min_Stack.push(val);
        }   
    }
    
    public void pop() {
        //Stack empty return nothing 
        if(stack.isEmpty()) return;
        int current = stack.pop();
        // If the popped element is equal to current minimum
        //remove it from min_Stack too
        if(current == min_Stack.peek()){
            min_Stack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_Stack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */