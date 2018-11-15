class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if (A.length > 1) {
            int iVal;
            for (int i = 0; i < A.length; i++) {
                if ((i % 2)!= (A[i] % 2)) {
                    iVal = A[i];
                    for (int j = i+1; j < A.length; j += 2) {
                        if ((A[j] % 2) != (A[i] % 2)) {
                            A[i] = A[j];
                            A[j] = iVal;
                            break;
                        }
                    }
                }
            }
        }
        return A;
    }
}
