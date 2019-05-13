class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || (nums.length == 1 && nums[0] != val)) return nums.length;
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        int count = 0;
        while (i < j) {
            if (nums[i] == val) {
                for (int k = j; k > i; k--) {
                    if (nums[k] != val) {
                        count ++;
                        temp = nums[i];
                        nums[i] = nums[k];
                        nums[k] = temp;
                        j = k;
                        //System.out.println(j);
                        break;
                    }
                }
            }
            i++;
        }
       
        for (j = nums.length - 1; j >= 0; j --) {
            if (nums[j] == val) {
                nums = Arrays.copyOf(nums, nums.length-1);
            }
        }
        
        return nums.length;
    }
}
