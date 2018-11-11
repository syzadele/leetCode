class Solution {
    public boolean isMonotonic(int[] A) {
        int diff;
        int prev = 0;
        int i;
        
        for(i = 0; i < A.length - 1; i++) {
            diff = A[i + 1] - A[i];
            
            if(diff != 0){
                if(prev * diff < 0){
                    return false;
                }
                prev = diff;
            }
        }
    return true;
    }
}
