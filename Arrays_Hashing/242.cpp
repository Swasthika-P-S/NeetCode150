class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> freq;
        for(char c : s)
            freq[c]++;
        for(char c : t)
            freq[c]--;
        for(auto &a : freq)
            if(a.second!=0) return false; 
        return true;
    }
};
