class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        if (bits.length == 1) return true;
        if (bits.length == 2) return bits[0] == 0;
        if (bits[bits.length - 2] == 0) return true;
        else {
            if (bits[bits.length - 3] == 0) return false;
            else {
                for (int i = bits.length - 3; i >= 0; i--) {
                    if (bits[i] == 1) {
                        count ++;
                    } else {
                        return count % 2 == 1;
                    }
                }
            }
        }
       return count % 2 == 1;
    }
}
