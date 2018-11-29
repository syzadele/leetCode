class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int r = 0;
        
        for (int i : nums1) {
            boolean isFound = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == i) {
                    isFound = true;
                }
                if (nums2[j] > i && isFound) {
                    result[r] = nums2[j];
                    r++;
                    break;
                }
                if (j == nums2.length - 1) {
                    result[r] = -1;
                    r++;
                }
            }
        }
        return result;
    }
}
