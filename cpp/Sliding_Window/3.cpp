class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int len = 0;
        int left = 0;
        set<char> lst;
        for(int i=0;i<s.size();i++)
        {
            while(lst.count(s[i]))
            {
                lst.erase(s[left]);
                left++;
            }
            lst.insert(s[i]);
            len = max(len,i-left+1);
        }
        return len;
    }
};
