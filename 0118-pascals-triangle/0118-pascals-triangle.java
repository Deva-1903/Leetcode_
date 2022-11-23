class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        //Initializie current row and previous row
        List<Integer> row, pre = null;
        for(int i=0; i<numRows; i++){
            row = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                //check if the pointer is in first or last column of the row.
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    //else go to previous row and sum the elements
                    row.add(pre.get(j - 1) + pre.get(j));
                }               
            }
            pre = row;
            ans.add(row); 
        }
        return ans;
    }
}