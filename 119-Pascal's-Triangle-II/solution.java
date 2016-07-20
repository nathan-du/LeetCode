public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if(rowIndex == 0) return list;
        while(rowIndex-- > 0 )
        {
            List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(1);
            for(int i = 0; i < list.size() - 1; i++)
            {
                tempList.add(list.get(i) + list.get(i + 1));
            }
            tempList.add(1);
            list = new ArrayList<Integer>(tempList);
        }
        return list;
    }
}