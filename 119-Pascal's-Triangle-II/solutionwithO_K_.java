public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if(rowIndex == 0) return list;
        for(int i = 1; i <= rowIndex; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(j == i) list.add(j, 1);
                else list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }
}