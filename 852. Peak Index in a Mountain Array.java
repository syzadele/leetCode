class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if (A.length > 1) {
            for (int i = 0; i < A.length; i++) {
                if (A[i+1] < A[i]) {
                    return i;
                }
                if (A[A.length - i - 1] > A[A.length - i - 2]) {
                    return A.length - i - 1;
                }
            }
        } 
    return 0;
    }
}
