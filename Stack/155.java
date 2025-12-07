package Stack;

import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> arr;
    ArrayList<Integer> minStack;

    public MinStack() {
        arr = new ArrayList<>();
        minStack = new ArrayList<>();

    }

    public void push(int val) {
        arr.add(val);
        if (minStack.isEmpty() || (val < minStack.get(minStack.size() - 1))) {
            minStack.add(val);
        } else {
            minStack.add(minStack.get(minStack.size() - 1));
        }
    }

    public void pop() {
        arr.remove(arr.size() - 1);
        minStack.remove(minStack.size() - 1);

    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
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
