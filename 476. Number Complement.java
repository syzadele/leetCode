class Solution {
    public int findComplement(int num) {
        int oneoneone = 0;
        for (int i = 32; i >= 0; i--) {
            if (num >= Math.pow(2,i)) {
                for (int j = 0; j <= i; j++) {
                    oneoneone += Math.pow(2,j);
                }
                break;
            }
        }
        
        return num^oneoneone;
    }
}
