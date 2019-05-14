class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) return 1;
        int result = 1;
        int tempMax = 0;
        for (int i  = 0; i < nums.length - 1; i++) {
            if (nums[i+1] > nums[i]) {
                result++;
            } 
            if ((nums[i + 1] <= nums[i] && result >= 1) || i + 1 == nums.length - 1) {
                
                if (result > tempMax) {
                    tempMax = result;
                }
                result = 1;
            }
        }
         return tempMax;
    }
}
