class Solution {
    public int distributeCandies(int[] candies) {
        int type = 1;
        Arrays.sort(candies);
        for (int i = 0; i < candies.length - 1; i++) {
            if (type < candies.length / 2) {    
                if (candies[i+1] != candies[i]) {
                    type++;
                }
            } else {
                return type;
            }
        }
        return type;
    }
}
