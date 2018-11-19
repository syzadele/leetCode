class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int first = S.indexOf(C);
        int second = S.indexOf(C, first + 1);    
        char[] sArray = S.toCharArray();
        
        for (int i = 0; i < S.length(); i++) {
            if (first == -1) {
                break;
            }
            if (i > second && second != -1) {
                first = second;
                second = S.indexOf(C, first + 1);
            }
            if (sArray[i] == C) {
                result[i] = 0;
            } else {
                if (i < first) {
                    result[i] = first - i;
                } else {
                    if (second != -1) {
                        result[i] = Math.min(i - first, second - i);
                    } else {
                        result[i] = i - first;
                    }
                }
            }
            
        }
        
        return result;
    }
}
