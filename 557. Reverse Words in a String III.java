class Solution {
    public String reverseWords(String s) {
        String[] ns = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < ns.length; j++) {
            char[] nsArray = ns[j].toCharArray();
            for (int i = ns[j].length() - 1; i >= 0 ; i--) {
                result.append(nsArray[i]);
            }
            result.append(" ");
        }
        String r = result.toString();
        r = r.substring(0, r.length() - 1);
        return r;
    }
}
