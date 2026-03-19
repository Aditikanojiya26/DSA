class Solution(object):
    def checkInclusion(self, p, s):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        res = []
        k = len(p)

        p_count = [0] * 26
        window = [0] * 26

        # build p_count
        for ch in p:
            p_count[ord(ch) - ord('a')] += 1

        left = 0

        for right in range(len(s)):
            # add
            window[ord(s[right]) - ord('a')] += 1

            if right - left + 1 == k:
                if window == p_count:
                    return True
                window[ord(s[left]) - ord('a')] -= 1
                left += 1

        return False
        