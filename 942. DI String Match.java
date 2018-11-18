class Solution {
    public int[] diStringMatch(String S) {
        if (S.length() > 0) {
            int[] result = new int[S.length() + 1];
            int start = 0;
            int end = S.length();
            for (int i = 0; i < S.length(); i++) {
                if (S.substring(i,i+1).equals("D")) {
                    result[i] = end;
                    end = end - 1;
                    if (i == S.length() - 1) {
                        result[i+1] = end;
                    }
                } 
                 if (S.substring(i,i+1).equals("I")) {
                    result[i] = start;
                    start = start + 1;
                    if (i == S.length() - 1) {
                        result[i+1] = start;
                    }
                }
            }
            return result;
        }
        return null;
    }
}
