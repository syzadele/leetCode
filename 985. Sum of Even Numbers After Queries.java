class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int index;
        int[] result = new int[queries.length];
 
        for (int i = 0; i < queries.length; i++) {
            index = queries[i][1];
            A[index] = A[index] + queries[i][0];
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    sum = sum + A[j];
                }
            }
            result[i] = sum; 
        }
        return result;
    }
}
