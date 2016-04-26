public class Solution {
    class Pairs implements Comparable<Pairs>
    {
        int number;
        int index;
        Pairs(int number, int index)
        {
            this.number = number;
            this.index = index;
        }
        public int compareTo(Pairs p2) {
			return this.number - p2.number;
		}
    }
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = nums.length - 1;
        int[] returnContent = new int[2];
        Pairs[] pairs = new Pairs[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            pairs[i] = new Pairs(nums[i], i + 1);
        }
        Arrays.sort(pairs);
        while(index1 < index2)
        {
            if(pairs[index1].number + pairs[index2].number < target)
            {
                index1++;
            }
            else
            {
                if(pairs[index1].number + pairs[index2].number > target)
                {
                    index2--;
                }
                else
                {
                    if(pairs[index1].index < pairs[index2].index)
                    {
                        returnContent[0] = pairs[index1].index;
                        returnContent[1] = pairs[index2].index;
                    }
                    else
                    {
                        returnContent[0] = pairs[index2].index;
                        returnContent[1] = pairs[index1].index;
                    }
                }
            }
        }
        return returnContent;
    }
}