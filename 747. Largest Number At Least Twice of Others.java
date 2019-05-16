class Solution {
    public int dominantIndex(int[] nums) {
        int last = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > max) {
                last = max;
                max = nums[i];
                index = i;
            }
            if (nums[i] > last && nums[i] < max) {
                last = nums[i];
            }
        }
        //System.out.println(last + " " + max);
        if (max >= 2 * last) {
            return index;
        }
        return -1;
    }
}
