class Solution(object):
    def removeElement(self, nums, val):
        count = 0   # 定義該元素的個數
        if val not in nums: return len(nums)    # 若該元素不在列表內，則直接回傳
        for num in nums:
            if val == num: count+=1 # 計算該元素的個數
        for _ in range(count): nums.remove(val) # 移除列表內的該元素
        return len(nums)