class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap ={}
        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in hashmap:
                return [i,hashmap.get(rem)]
            else:
                hashmap[nums[i]]=i

        
        return [-1,-1]
            
        