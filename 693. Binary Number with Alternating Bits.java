class Solution {
    public boolean hasAlternatingBits(int n) {
        int i = 0;
        while (n >> (i+1) > 0) {
            if ((n >> (i) & 1) == (n >> (i+1) & 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
