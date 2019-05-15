class Solution {
    public int[] plusOne(int[] digits) {
        int compter = 1;
       
        for (int i = 1; i <= digits.length; i++) {
            if (digits[digits.length - i] + compter < 10) {
                digits[digits.length - i] += compter;
                compter = 0;
                return digits;
            } else {
                compter = (int)(digits[digits.length - i] + compter)/10;
                digits[digits.length - i] = digits[digits.length - i] + compter - 10;
            }
        }
        
        if (compter > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = compter;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } 
        
        
        return digits;
    }
}
