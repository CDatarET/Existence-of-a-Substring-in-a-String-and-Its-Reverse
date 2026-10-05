class Solution {
public:
    bool isSubstringPresent(string s) {
        string rev = s;
        reverse(rev.begin(), rev.end());
        for(int i = 0; i < s.size() - 1; i++){
            for(int j = 0; j < s.size() - 1; j++){
                if(s[i] == rev[j] && s[i + 1] == rev[j + 1]){
                    return true;
                }
            }
        }

        return false;
    }
};
