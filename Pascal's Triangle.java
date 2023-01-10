class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
           for(int j=0;j<i+1;j++){
               if(j == 0 || j == i) {
                list.add(1);
                }
               else{
                   list.add(j,(rows.get(i-1).get(j)+rows.get(i-1).get(j-1)));
               }
           }
            rows.add(list);
        }
        return rows;
    }
}