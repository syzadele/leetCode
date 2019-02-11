class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    return A[j];
                }
            }
        }
        return 0;
    }
}
