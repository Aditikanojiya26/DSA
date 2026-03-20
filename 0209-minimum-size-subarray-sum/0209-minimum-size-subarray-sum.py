class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        l , min_length , curr_sum = 0 , len(nums) , 0
        for i in range(len(nums)):
            curr_sum += nums[i]
        
            while curr_sum >= target:
            
                min_length = min(min_length,i-l+1)
                curr_sum -=nums[l]
              
                l+=1
        if sum(nums) < target:
            return 0
        return min_length
                
        