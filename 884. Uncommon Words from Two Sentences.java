class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        String sentence = A + " " + B;
        String[] splitSentence = sentence.split(" ");
        ArrayList<String> resultList = new ArrayList<String>();
        
        for (String str : splitSentence) {
            resultMap.put(str, resultMap.getOrDefault(str, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() == 1) {
                resultList.add(entry.getKey());
            }
        }
        return resultList.toArray(new String[resultList.size()]);
    }
}
