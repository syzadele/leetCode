class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        char[] lettres = s.toCharArray();
        if (!s.equals("")) {
            for (int i = lettres.length - 1; i >= 0; i--) {
                result.append(lettres[i]);
            }
        }
        return result.toString();
    }
}
