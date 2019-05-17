class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int temp = 0;
        for (int j = 0; j < k; j++) {
            temp += nums[j];
        }
        sum = temp;
        if (nums.length > 1) {
            for (int i = 1; i <= nums.length - k; i++) {
                temp = temp - nums[i - 1] + nums[i + k - 1];

                if (temp > sum) {
                    sum = temp;
                }
            }
            return (double)sum/k;
        }
        return (double)sum;
    }
}
