class Solution {
    public int smallestRangeI(int[] A, int K) {
        if (A.length > 1) {
            List<Integer> listA = new ArrayList<Integer>();
            for (int value : A) {
                listA.add(value);
            }
            double diff = Double.valueOf(Collections.max(listA) - Collections.min(listA))/2;
            if (Math.ceil(diff) <= K) {
                return 0;
            } else {
                return (int)Math.round((diff-Double.valueOf(K))*2);
            }
            
        }
        return 0;
    }
}
