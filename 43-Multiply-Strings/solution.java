class Solution {
    public String multiply(String num1, String num2) {
        int[] pos = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >=0; i--) {
            for(int j = num2.length() - 1; j >=0; j--) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = temp + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(int p : pos) if(!(res.length() == 0 && p == 0)) res.append(p);
        return res.length() == 0? "0": res.toString();
    }
}
