class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= Math.min(nums.length - i - 1, k); j++) {
                if (nums[i] == nums[i+j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
