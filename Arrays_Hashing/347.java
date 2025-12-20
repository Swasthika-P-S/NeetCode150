package Arrays_Hashing;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Map<Integer, List<Integer>> freq = new HashMap<>();
        for (Map.Entry<Integer, Integer> hm : map.entrySet()) {
            if (!(freq.containsKey(hm.getValue()))) {
                ArrayList<Integer> temp = new ArrayList<>();
                freq.put(hm.getValue(), temp);
            }
            freq.get(hm.getValue()).add(hm.getKey());
        }

        int res[] = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 1; i--) {
            if (freq.containsKey(i)) {
                for (int num : freq.get(i)) {
                    if (idx < k) {
                        res[idx++] = num;
                    } else {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
