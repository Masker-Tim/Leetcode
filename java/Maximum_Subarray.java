public class Maximum_Subarray{
    public static int maxSubArray(int[] nums) {
        int currentSum = 0; // 目前總合
        int maxSum = Integer.MIN_VALUE; // 最大總合
        for(int n:nums){
            if(n>currentSum && currentSum<0){currentSum = n;}   //若總合小於某元素值及總合為負，則取代
            else{currentSum+=n;}    // 其他則累加

            if(currentSum>maxSum){maxSum=currentSum;}   //若目前總合大於最大總合，取代最大總合值
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.printf("answer:%d",maxSubArray(test));
    }
}