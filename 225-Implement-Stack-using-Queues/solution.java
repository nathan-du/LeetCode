class MyStack {
    LinkedList<Integer> list = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        list.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        list.remove(list.size() - 1);
    }

    // Get the top element.
    public int top() {
        return list.peekLast();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return list.isEmpty();
    }
}