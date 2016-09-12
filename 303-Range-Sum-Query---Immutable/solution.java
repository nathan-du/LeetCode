public class NumArray {
    int[] numbers;
    public NumArray(int[] nums) {
        numbers = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
        }
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(; i <= j; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);