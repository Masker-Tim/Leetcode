class Solution(object):
    def isValid(self, s):
        table = {')':'(','}':'{',']':'['}   # 定義Parentheses Pairs
        str_list = []   # 定義堆疊(stack)
        if len(s)<1: return True    # 若沒字串，則回傳true
        # Parentheses Pairs 循迴
        for ch in s:
            if ch in table.values():    # 左邊括號加入stack
                str_list.append(ch)
            elif not str_list or str_list.pop()!=table[ch]: # 若僅剩右邊括號或與堆疊的左括號型態不一
                return False    # 回傳False
        return not str_list # 若空的堆疊，則True