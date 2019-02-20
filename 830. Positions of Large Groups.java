class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int count = 1;
        char[] str = S.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i < str.length -1 && str[i+1] == str[i]) {
                count ++;
            } else {
                if (count >= 3) {
                    result.add(Arrays.asList(i-count+1,i));
                }
                count = 1;
            }
        }
        return result;
    }
}
