class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int width = grid[0].length;
        int height = grid.length;
        
        for (int l = 0; l < height; l++) {
            for (int c = 0; c < width; c++) {
                if (grid[l][c] == 1) {
                    if (c > 0) {
                        if (grid[l][c - 1] == 0) result++;
                    } else {
                        result++;
                    }
                    if (c < width - 1) {
                        if (grid[l][c + 1] == 0) result++;
                    } else {
                        result++;
                    }
                    if (l > 0) {
                        if (grid[l - 1][c] == 0) result++;
                    } else {
                        result++;
                    }
                    if (l < height - 1) {
                        if (grid[l + 1][c] == 0) result++;
                    } else {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
