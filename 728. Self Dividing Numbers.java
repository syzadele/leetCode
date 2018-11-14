class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numberList = new ArrayList<Integer>();
        
        for (int i = left; i <= right; i ++ ) {
            char[] value = (String.valueOf(i)).toCharArray();
            if (!new String(value).contains("0")) {
                for (int j = 0; j < value.length; j ++) {
                    if (value[j] != '0') {
                        if ( i % Character.getNumericValue(value[j]) == 0) {
                            if (j == value.length - 1) {
                                numberList.add(i);
                            }
                        } else {
                            break;
                        } 
                    }
                }
            }
        }
    return numberList;
    }
}
