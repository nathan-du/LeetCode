public class Solution {
    public String intToRoman(int num) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] cd = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] xl = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] iv = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return m[num / 1000] + cd[(num % 1000) / 100] + xl[(num % 100) / 10] + iv[num % 10];
    }
}