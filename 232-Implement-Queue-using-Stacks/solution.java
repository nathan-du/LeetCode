class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> outStack = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        outStack.pop();
    }

    // Get the front element.
    public int peek() {
        if(outStack.empty()) {
            while(!stack.empty())
            outStack.push(stack.pop());
        }
        return outStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty() && outStack.empty();
    }
}