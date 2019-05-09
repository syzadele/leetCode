class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> lastRow = new ArrayList<Integer>();
        ArrayList<Integer> thisRow = new ArrayList<Integer>();
        
        for (int i = 0; i < numRows; i++) {
                
            for (int j = 0; j <= i; j++) {
                     
                if (j == 0) {

                    thisRow.add(1);
                } else {
                    
                    int left = 0;
                    int right = 0;
                     
                    if (j - 1 >= 0) {
                        left = lastRow.get(j-1);
                    }
                    if (j < lastRow.size()) {
                        right = lastRow.get(j);
                    }
                    
                     thisRow.add(left + right);
                 }
            }
            result.add(thisRow);
            lastRow = thisRow;
            thisRow = new ArrayList<Integer>();
        }
        return result;
    }
}
