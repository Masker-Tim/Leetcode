class Solution(object):
    def singleNumber(self, nums):
        dict = {}
        for num in nums:    # 紀錄該陣列的數值累積
            if not dict.has_key(num):
                dict[num]=1
            else:
                dict[num]+=1
        for key,value in dict.items():  # 取出只有出現1次的
            if(value==1):
                return key