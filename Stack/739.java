package Stack;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> stack = new Stack<>();
        int n = temps.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                int prevDayIdx = stack.pop();
                ans[prevDayIdx] = i - prevDayIdx;

            }
            stack.push(i);
        }

        return ans;
    }
}
