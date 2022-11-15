class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        
        int top = 0;
        int bottom = arr.length-1;
        int right = 0;
        int left = arr.length-1;
       
        
        int count = 1;
        while(right<=left && top<=bottom){
            
            for(int i=top; i<=left; i++ ){
                arr[top][i] = count ++;
            }
            top++;
           
            for(int i=top; i<=bottom; i++){
                 arr[i][left] = count;
                 count++;
            }
            left--;
            
            if(right<=left){
                for(int i=left; i>=right; i--){
                    arr[bottom][i] = count;
                    count++;
                }
            }
            bottom--;
            
            if(top<=bottom){
                for(int i=bottom; i>=top; i--){
                    arr[i][right] = count;
                    count++;
                }
            }
            right++;
        }
        return arr;
    }
}