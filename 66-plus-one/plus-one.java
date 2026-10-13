class Solution {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int i;

        for (i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

    
        int[] result = new int[length + 1];
        result[0] = 1;

        return result;
    }
}