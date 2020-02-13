class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums); // 排序
        ArrayList<Integer> ans = new ArrayList<>(); // 定義答案
        int lens = nums.length; // 定義陣列長度
        if(lens==0){ return ans;} // 若長度為0，則回傳
        
        int i = 0; // 定義迴圈起始值
        while(i<lens - lens / 3){ // 定義迴圈終止條件
            if(nums[i]==nums[i+lens/3]){ // 若次數多餘lens/3，則將答案加入陣列
                int temp = nums[i]; // 儲存答案
                ans.add(temp); // 將答案加入陣列
                i+=lens/3; // 索引值+lens/3
                while (i < lens - lens / 3 && nums[i] == temp) i++; // 若仍未達終止條件則繼續索引
            }else{i++;} // 若不合則索引值繼續索引
        }
        
        return ans; // 回傳答案
    }
}