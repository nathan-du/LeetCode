class MyStack {
    LinkedList<Integer> list = new LinkedList<Integer>();
    int top;
    // Push element x onto stack.
    public void push(int x) {
        list.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        list.remove();
        if(list.peek() != null) top = list.peek();
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return list.isEmpty();
    }
}