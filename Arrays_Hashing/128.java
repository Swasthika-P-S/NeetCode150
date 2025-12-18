package Arrays_Hashing;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for (int num : nums) {
            map.add(num);
        }
        
        int longest = 0;
        for (int num : map) {
            if (!map.contains(num - 1)) {
                int length = 1;
                while (map.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        
        return longest;
    }
}