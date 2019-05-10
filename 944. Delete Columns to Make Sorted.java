class Solution {
    public int minDeletionSize(String[] A) {
        int result = 0; 
        int thisValue = 0;
        int lastValue;
        
        for (int i = 0; i < A[0].length(); i++) {

                lastValue = 0;
                for (int j = 0; j < A.length; j++) {
                    thisValue = A[j].charAt(i);
                   
                    if (lastValue > thisValue) {
                        result ++;
                        break;
                    }
                    lastValue = thisValue;
                }
                
        }
        return result;
    }
}
