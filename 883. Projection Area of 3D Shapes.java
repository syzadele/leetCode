class Solution {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        if (grid != null) {
            int xy = grid.length * grid[0].length;
            int xz = 0;
            int yz = 0;
            int emptyCase = 0;
            
            for (int[] xCase : grid) {
                int maxXCase = xCase[0];
                if (maxXCase == 0){
                    emptyCase ++;
                }
                if (xCase.length > 1) {
                    for (int i = 0; i < xCase.length - 1; i++) {
                        if (xCase[i+1] > maxXCase) {
                            maxXCase = xCase[i+1];
                            System.out.println(maxXCase);
                        }
                        if (xCase[i+1] == 0) {
                            emptyCase ++;
                        }
                    }
                } 
                xz += maxXCase;
            }
            
            for (int j = 0; j < grid[0].length; j++) {
                int maxXCase = grid[0][j];
                if (grid.length > 1) {
                    for(int i = 0; i < grid.length - 1; i++) {
                        if (grid[i+1][j] > maxXCase) {
                            maxXCase = grid[i+1][j];
                        }
                    }
                } 
                yz += maxXCase;
            }
            System.out.println(xy + " " + xz + " " + yz + " " + emptyCase);
            sum = xy + xz + yz - emptyCase;
        }
        return sum;
    }
}
