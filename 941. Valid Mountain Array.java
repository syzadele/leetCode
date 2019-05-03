class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3 || A[1] < A[0]) {
            return false;
        } else {
            int pick = 0;
            for (int i = 2; i < A.length; i++) {
                if (A[i] < A[i - 1] && pick == 0) {
                        pick = i-1;
                } else if (A[i] >= A[i - 1] && pick != 0) {
                    return false;
                }
            }
             return (pick != 0);
        }
    }
}
