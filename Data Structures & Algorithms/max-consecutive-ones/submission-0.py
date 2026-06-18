class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        counter = 0
        greatestCounter = counter

        for num in nums:
            if num == 1:
                counter += 1
            else:
                if (counter > greatestCounter):
                    greatestCounter = counter
                counter = 0
        if (counter > greatestCounter):
            greatestCounter = counter
        return greatestCounter
        
