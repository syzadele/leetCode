class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 1;
        int left = 0;
        int right = 0;
        for (int j = 0; j < nums.length; j++) {
                right += nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                left += nums[i - 1];
            } 
            right -= nums[i];
            if (left == right) {
                return i;
            } 
        }
        return -1;
    }
}
