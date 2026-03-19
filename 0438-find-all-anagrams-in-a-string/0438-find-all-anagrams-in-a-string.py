class Solution(object):
    def findAnagrams(self, s, p):
        p_map = {}
        for ch in p:
            p_map[ch] = p_map.get(ch, 0) + 1

        window = {}
        result = []
        left = 0
        k = len(p)

        for right in range(len(s)):
            # add
            window[s[right]] = window.get(s[right], 0) + 1

            # maintain window size
            if right - left + 1 == k:
                # check anagram
                if window == p_map:
                    result.append(left)

                # remove
                window[s[left]] -= 1
                if window[s[left]] == 0:
                    del window[s[left]]
                left += 1

        return result
        