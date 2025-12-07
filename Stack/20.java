package Stack;

import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (ch == ')' && stack.get(stack.size() - 1) == '(') {
                        stack.remove(stack.size() - 1);
                    } else if (ch == '}' && stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size() - 1);
                    } else if (ch == ']' && stack.get(stack.size() - 1) == '[') {
                        stack.remove(stack.size() - 1);
                    } else {
                        stack.add(ch);
                    }
                }
            } else {
                stack.add(ch);
            }

        }
        return stack.isEmpty();
    }
}
