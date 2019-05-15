class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastRow = new ArrayList();
        lastRow.add(1);
        if (rowIndex == 0) return lastRow;
        
        List<Integer> thisRow = new ArrayList();
        int left = 0;
        int right = 0;
        for (int j = 0; j <= rowIndex; j++) {
            
            for (int i = 0; i <= j; i++) {
                
                if (i - 1 >= 0) {
                    left = lastRow.get(i-1);
                } else {
                    left = 0;
                }
                if (i <= lastRow.size() - 1) {
                    right = lastRow.get(i);
                } else {
                    right = 0;
                }
                thisRow.add(left + right);
            }
            lastRow = thisRow;
            thisRow =  new ArrayList();
        }
        return lastRow;
    }
}
