class Solution {
    public String reverseOnlyLetters(String S) {
        char[] ss = S.toCharArray();
        int i = 0;
        int j = ss.length - 1;
        
        while (i < j) {
            if (Character.isLetter(ss[i])) {
                while (!Character.isLetter(ss[j])) {
                    j--;
                }
                char temp = ss[i];
                ss[i] = ss[j];
                ss[j] = temp;
                j--;
                i++;
            } else {
                i++;
            }
        }
       
        return String.valueOf(ss);
    }
}
