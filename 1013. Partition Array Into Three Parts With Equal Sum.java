class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        ArrayList<Integer> partSum = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            partSum.add(sum);
        }
        if (sum % 3 != 0) {
            
            return false;
        } else {
            int first = partSum.indexOf(sum/3);
            for (int i = 0; i <= first; i++) {
                partSum.remove(0);
            }
            int second = partSum.indexOf(sum/3*2);
            for (int i = 0; i <= second; i++) {
                partSum.remove(0);
            }
            int third = partSum.indexOf(sum);
            for (int i = 0; i <= third; i++) {
                partSum.remove(0);
            }
            
            if(first >= 0 && second >= 0 && third >= 0) {
                return true;
            }
        }
       
        return false;
    }
}
