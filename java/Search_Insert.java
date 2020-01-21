public class Search_Insert{
    public static int searchInsert(int[] nums,int target){
        int low = 0;    // 最前端的索引指標
        int upper = nums.length-1;  // 最後端的索引指標
        /* 當最前端的指標未與最後端的指標重疊或超越 */
        while(low<upper){
            int mid = (low+upper)/2;    // 取中間位置
            if(nums[mid]<target){low = mid+1;}  // 如果中間值小於目標值，則最前端指標則移動到中間值+1
            else if(nums[mid]>target){upper = mid-1;}   // 上者，反之
            else{return mid;}   // 如果中間值與目標值相同，則答案
        }
        return target>nums[low]?low+1:low;  // 如果雙指標重疊或交錯，則數列無目標值，則指出該放的索引值
    }
    public static void main(String args[]){
        int[] test = {1,3,5,6};
        int target = 0;
        System.out.printf("index:%d",searchInsert(test, target));
    }
}