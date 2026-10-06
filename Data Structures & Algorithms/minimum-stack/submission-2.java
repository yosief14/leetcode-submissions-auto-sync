class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mIntegers;

    public MinStack() {
        stack = new Stack<Integer>();
        mIntegers = new Stack<Integer>();
    }

    public void push(int value) {
        stack.push(value);
        if (mIntegers.isEmpty() || value <=mIntegers.peek()) {
            mIntegers.add(value);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int poppedVal = stack.pop();
        if (poppedVal == mIntegers.peek()) {
            mIntegers.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mIntegers.peek();
    }
}
