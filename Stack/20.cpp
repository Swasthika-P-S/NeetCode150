class Solution {
public:
    bool isValid(string s) {
        vector<char> check;

        for (char c : s) {
            if (c == '{' || c == '[' || c == '(') {
                check.push_back(c);
            } else {
                if (check.empty()) return false;
                char top = check.back();
                if ((c == '}' && top == '{') ||
                    (c == ']' && top == '[') ||
                    (c == ')' && top == '(')) {
                    check.pop_back();
                } else {
                    return false;
                }
            }
        }
        return check.empty();
    }
};
