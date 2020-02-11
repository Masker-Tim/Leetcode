class Solution {
    public int majorityElement(int[] nums) {
        double times = Math.floor(nums.length/2);   // 最多出現次數
        Map<Integer,Integer> map = new HashMap<>(); // 定義Hashmap
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){  // 有無包含此Key
                map.put(nums[i],1); // 無則新增key與value
            }else{
                int num = map.get(nums[i])+1; // 有則取得該key
                map.put(nums[i],num); // 更改該key的value
                if(map.get(nums[i])>times){return nums[i];} // 若超過該限制次數，則回傳
            }
        }
        return nums[0]; // 假設陣列1個的情況下，回傳該值
    }
}