class Solution:
    def isSubstringPresent(self, s: str) -> bool:
        t = s[::-1]
        for i in range(len(s)):
            for j in range(i + 2, len(s) + 1):
                if s[i:j] in t:
                    return True

        return False
