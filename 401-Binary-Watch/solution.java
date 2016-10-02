public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList();
        int[] hour = new int[]{8, 4, 2, 1}, minute = new int[]{32, 16, 8, 4, 2, 1};
        for(int i = 0; i <= num; i++) {
            List<Integer> list1 = generateDigit(hour, i);
            List<Integer> list2 = generateDigit(minute, num - i);
            for(int num1 : list1)
            {
                if(num1 > 11) continue;
                for(int num2 : list2) {
                    if(num2 >= 60) continue;
                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
                }
            }
        }
        return res;
    }
    
    public List<Integer> generateDigit(int[] time, int count) {
        List<Integer> res = new ArrayList();
        generateDigitHelper(time, count, 0, 0, res);
        return res;
    }
    
    public void generateDigitHelper(int[] time, int count, int pos, int sum, List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }
        for(int i = pos; i < time.length; i++) {
            generateDigitHelper(time, count - 1, i + 1, sum + time[i], res);
        }
    }
}