class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        l,result = 0,0
        window_state = {}
        for r in range(len(s)):
            char = s[r]
            window_state[char]=window_state.get(char,0)+1

            while window_state[char]>1:
                left_char = s[l]
                window_state[left_char]-=1
                if window_state[left_char] == 0:
                    del window_state[left_char]
                l+=1

            result = max(result,r-l+1)

        return result
        