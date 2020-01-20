class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;  // 當陣列為空時，回傳0
        /* 設置前、後指標，來判斷前後一不一致的元素 */
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1; // 回傳其長度
    }
    public static void main(String[] args) {
        int[] a = {1,1,2};
        System.out.println(removeDuplicates(a));
    }
}