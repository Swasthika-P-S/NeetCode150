package Stack;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")) {
                s.push(tokens[i]);
            } else if (tokens[i].equals("+")) {
                String a = s.pop();
                String b = s.pop();
                int c = Integer.parseInt(b) + Integer.parseInt(a);
                s.push(Integer.toString(c));
            } else if (tokens[i].equals("-")) {
                String a = s.pop();
                String b = s.pop();
                int c = Integer.parseInt(b) - Integer.parseInt(a);
                s.push(Integer.toString(c));
            } else if (tokens[i].equals("*")) {
                String a = s.pop();
                String b = s.pop();
                int c = Integer.parseInt(b) * Integer.parseInt(a);
                s.push(Integer.toString(c));
            } else {
                String a = s.pop();
                String b = s.pop();
                int c = Integer.parseInt(b) / Integer.parseInt(a);
                s.push(Integer.toString(c));
            }

        }
        return Integer.parseInt(s.peek());
    }
}
