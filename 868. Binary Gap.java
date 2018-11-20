class Solution {
    public int binaryGap(int N) {
        int maxDis = 0;
        int tail = 0;
        int divisor = N;
        int dis = 0;
        
        while (divisor != 0) {
            tail = divisor % 2;
            divisor = (int)divisor/2;
            if (tail == 1) {
                if (dis > maxDis) {
                    maxDis = dis;
                }
                dis = 1;
            } else if (dis != 0) {
                dis++;
            }
        }
        return maxDis;
    }
}
