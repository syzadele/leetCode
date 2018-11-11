class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int nRow =  nums.length;
        int nCol = nums[0].length;
        int i = 0;
        int j = 0;
        int row = 0;
        int col = 0;
        int[][] result = new int[r][c];
        
        if(r * c > nRow * nCol){
            return nums;
        }
        
        for (row = 0; row < r; row ++) {
            for (col = 0; col < c; col ++) {

                result[row][col] = nums[i][j];

                if(j == nCol - 1){
                    j = 0;
                    if(i == nRow - 1){
                        i = 0;
                    }else{
                        i++;
                    }
                }else{
                    j++;
                }
            }
        }
            
    return result;
    }
}
