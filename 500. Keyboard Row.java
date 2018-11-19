class Solution {
    public String[] findWords(String[] words) {
        String[] keyboardLine = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        
        List<String> result = new ArrayList<String>();
        
        for (String word : words) {
            char[] wordArray = word.toCharArray();
            int firstChar = 0;
            boolean isSame = true;
            for (int i = 0; i < keyboardLine.length; i++) {
                String str = keyboardLine[i].toString();
                char c = wordArray[0];
                if (str.indexOf(c) != -1){
                    firstChar = i;   
                }
            }
            for (int i = 1; i < wordArray.length; i++) {
                String str = keyboardLine[firstChar].toString();
                char c = wordArray[i];
                if (str.indexOf(c) == -1){
                    isSame = false;
                }
            }
            if (isSame) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
}
