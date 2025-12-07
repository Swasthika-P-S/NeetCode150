package Stack;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> s = new Stack<>();
        int n = speed.length;
        int pair[][] = new int[position.length][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < n; i++) {
            s.add((double) (target - pair[i][0]) / pair[i][1]);
            while (s.size() >= 2 && s.peek() <= s.get(s.size() - 2)) {
                s.pop();
            }
        }
        return s.size();
    }
}
