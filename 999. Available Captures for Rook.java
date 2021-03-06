class Solution {
    public int numRookCaptures(char[][] board) {
        int axeX = 0;
        int axeY = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                if (board[i][j] == 'R') {
                    axeX = j;
                    axeY = i;
                    break;
                }
            }
        }
        int i = axeY;
        int j = axeX;
        int result = 0;
        while (board[i][j] != 'B' && i > 0) {
            i--;
            if (board[i][j] == 'p') {
                result ++;
                break;
            }
           
        }
        i = axeY;
        while (board[i][j] != 'B' && i < 7) {
            i++;
            if (board[i][j] == 'p') {
                result ++;
                break;
            }
        }
        i = axeY;
        j = axeX;
       while (board[i][j] != 'B' && j > 0) {
           j--;
            if (board[i][j] == 'p') {
                result ++;
                break;
            }
        }
        j = axeX;
        while (board[i][j] != 'B' && j < 7) {
            j++;
            if (board[i][j] == 'p') {
                result ++;
                break;
            }
        }
        return result;
        
    }
}
