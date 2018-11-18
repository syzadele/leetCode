class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        char[] lettres = S.toCharArray();
        int lineWidth = 0;
        int lines = 1;
        for (char c : lettres) {
            if (lineWidth + widths[c - 'a'] <= 100) {
                lineWidth += widths[c - 'a'];
            } else{ 
                lines++;
                lineWidth = widths[c - 'a'];
            }
        }
        int[] result = {lines, lineWidth};
        return result;
    }
}
