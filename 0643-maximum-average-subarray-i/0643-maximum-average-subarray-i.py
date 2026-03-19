class Solution(object):
    def findMaxAverage(self, nums, k):
        curSum = sum(nums[:k])

        maxSum = curSum
        
        for i in range(k, len(nums)):
            curSum += nums[i] - nums[i-k]

            if curSum > maxSum:
                maxSum = curSum

        return maxSum / float(k)