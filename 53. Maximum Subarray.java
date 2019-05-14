class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum + nums[i] > 0) {
                sum = Math.max(sum + nums[i], nums[i]); 
            } else {
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
