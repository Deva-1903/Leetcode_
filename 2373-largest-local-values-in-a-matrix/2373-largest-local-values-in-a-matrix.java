class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans.length; j++){
                ans[i][j] = findMax(grid, i, j);
            }
        }
        return ans;
    } 
    public int findMax(int[][] arr, int start, int end){
        int max = 0;
        for(int i = start; i<start+3; i++){
            for(int j = end; j<end+3; j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
}