class Solution(object):
    def findMaxAverage(self, arr, k):
        window_sum = sum(arr[:k])
        max_avg = window_sum / float(k)

        for i in range(k, len(arr)):
            window_sum = window_sum - arr[i - k] + arr[i]
            max_avg = max(max_avg, window_sum / float(k))

        return max_avg