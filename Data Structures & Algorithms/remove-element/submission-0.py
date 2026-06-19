class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        for num in nums[:]:
            if num == val:
                nums.remove(num)
            else:
                k += 1
        return k

        