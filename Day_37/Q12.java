class Solution {
    public String intToRoman(int num) {
        String op = "";
        int key[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String val[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int pointer = key.length - 1;
        while (num != 0) {
            if (num < key[pointer]) {
                pointer--;
            } else {
                num -= key[pointer];
                op += val[pointer];
            }
        }
        return op;
    }
}