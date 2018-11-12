class Solution {
    public int hammingDistance(int x, int y) {
        int numberDiff = 0;
        for (int digit = 30; digit >= 0; digit --) {
            if (x == 0 && y == 0) {break;}
            int numberAtDigit = 0;
            int powerValue = (int)Math.pow(2, digit);
            if (x >= powerValue) {
                x -= powerValue;
                numberAtDigit += 1;
            }
            if (y >= powerValue) {
                y -= powerValue;
                numberAtDigit += 1;
            }
            if (numberAtDigit == 1) {numberDiff += 1;} 
        }
        return numberDiff;
    }
}
