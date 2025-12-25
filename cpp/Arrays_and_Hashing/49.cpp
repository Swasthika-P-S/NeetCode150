class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> res;
        vector<bool> used(strs.size(), false);

        for (int i = 0; i < strs.size(); i++) {
            if (used[i]) continue;

            vector<string> check = isana(strs, strs[i], used);
            res.push_back(check);
        }
        return res;
    }

    vector<string> isana(vector<string>& strs, string &s, vector<bool>& used)
    {
        vector<string> match;
        map<char,int> freq;

        // build frequency of s
        for (char c : s) {
            freq[c]++;
        }

        for (int i = 0; i < strs.size(); i++) {
            if (used[i]) continue;

            string &st = strs[i];
            if (st.size() != s.size()) continue;

            map<char,int> temp = freq;
            bool check = true;

            for (char c : st) {
                if (temp.find(c) == temp.end() || temp[c] == 0) {
                    check = false;
                    break;
                }
                temp[c]--;
            }

            if (check) {
                match.push_back(st);
                used[i] = true;
            }
        }
        return match;
    }
};
