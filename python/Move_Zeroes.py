class Solution(object):
    def moveZeroes(self, nums):
        count = 0   # 計算0的數量
        # 巡迴並計算0的數量
        for num in nums:
            if num==0:
                count+=1
        # 若有0則將0擺放在陣列後面
        if count > 0:
            for i in range(count):
                nums.remove(0)
                nums.append(0)
        return nums