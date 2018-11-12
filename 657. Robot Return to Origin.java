class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = {0,0};
        for (char step: moves.toCharArray()) {
            switch (step) {
                case 'L' : position[0] -= 1;
                    break;
                case 'R' : position[0] += 1;
                    break;
                case 'U' : position[1] += 1;
                    break;
                case 'D' : position[1] -= 1;
            }
        }
    return position[0] == 0 && position[1] == 0 ? true : false;
    }
}
