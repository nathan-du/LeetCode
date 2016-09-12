public class NumArray {
    int[] numbers;
    public NumArray(int[] nums) {
        numbers = new int[nums.length + 1];
        numbers[0] = 0;
        for(int i = 0; i < nums.length; i++) {
            numbers[i + 1] = numbers[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return numbers[j + 1] - numbers[i];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);