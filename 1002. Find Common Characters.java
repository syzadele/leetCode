class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<String>();
        char[] firstWord = A[0].toCharArray();
        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (!A[j].contains(String.valueOf(firstWord[i]))) {
                    break;
                }
                if (j == A.length - 1) {
                    for (int k = 1; k < A.length; k++) {
                        A[k] = A[k].substring(0,A[k].indexOf(String.valueOf(firstWord[i])))  + A[k].substring(A[k].indexOf(String.valueOf(firstWord[i]))+1, A[k].length());
                    }
                     result.add(String.valueOf(firstWord[i]));
                }
            }
        }
        return result;
    }
}
