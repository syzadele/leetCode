class Solution {
    public int[][] imageSmoother(int[][] M) {
       
        int[][] result = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int sum = 0;
                int count = 0;
                for (int k = i-1; k<=i+1; k++) {
                    for (int q = j-1; q<= j+1; q++) {
                        if (k>=0 && k<M.length && q>=0 && q<M[0].length) {
                            sum += M[k][q];
                            count++;
                        }
                    }
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}
