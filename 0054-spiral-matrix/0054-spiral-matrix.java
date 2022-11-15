class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> answer = new  ArrayList<Integer>();
        
        int top = 0;
        int bottom = matrix.length-1;
        int right = 0;
        int left = matrix[0].length-1;
        
        while(top<=bottom && right<=left){
            
            // first row iteration
            for(int i=right; i<=left; i++){
                answer.add(matrix[top][i]);
            }
            top++;
            
            //top to bottom
            for(int i=top; i<=bottom; i++){
                answer.add(matrix[i][left]);
            }
            left--;
            
            if(top<=bottom){
                for(int i=left; i>=right; i--){
                    answer.add(matrix[bottom][i]);
                }
            }
             bottom--;
            
            if(right<=left){
              for(int i=bottom; i>=top; i--){
                   answer.add(matrix[i][right]);
              }
            }
             right++;
            
        }
        return answer;
        }
    }
