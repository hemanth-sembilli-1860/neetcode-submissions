class MinStack {
    static Stack<Integer> st;
    static Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (!st.isEmpty()){
           int d = st.pop(); 
        if (minStack.peek()==d){
            minStack.pop();
        }
        }
    }
    
    public int top() {
        if (!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if (!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}
