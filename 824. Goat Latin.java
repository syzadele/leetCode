class Solution {
    public String toGoatLatin(String S) {
        String[] ss = S.split(" ");
        String end = "";
        StringBuilder r = new StringBuilder();
        
        for (String str : ss) {
            end = end + "a";
            
            if (str.charAt(0) == 'a'|
               str.charAt(0) == 'A'|
               str.charAt(0) == 'e'|
               str.charAt(0) == 'E'|
               str.charAt(0) == 'i'|
               str.charAt(0) == 'I'|
               str.charAt(0) == 'o'|
               str.charAt(0) == 'O'|
               str.charAt(0) == 'u'|
               str.charAt(0) == 'U') {
                r.append(str + "ma" + end + " ");
                
            } else {
                char first = str.charAt(0);
                r.append(str.substring(1) + first + "ma" + end + " ");
            }
        }
        r.setLength(r.length() - 1);
        return r.toString();
    }
}
