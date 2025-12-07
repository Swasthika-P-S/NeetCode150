package Two_Pointers;

class Solution {
    public int maxArea(int[] h) {
        int i = 0;
        int j = h.length - 1;
        int MaxArea = Integer.MIN_VALUE;
        while (i < j) {
            int height = Math.min(h[i], h[j]);
            int width = j - i;
            MaxArea = Math.max(MaxArea, (height * width));
            if (h[i] > h[j]) {
                j--;
            } else {
                i++;
            }

        }
        return MaxArea;
    }
}
