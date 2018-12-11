class Solution {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i ++) {
            int bit = 0;
            char[] str = Integer.toBinaryString(i).toCharArray();
    
            for (char c : str) {
                if (c == '1') {
                    bit ++;
                }
            }
            if (bit != 1 && isPrime(bit)) {
                result ++;
            }
        }
        return result;
    }
    
    public boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
