class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int start,end,temp;

        
        for(int i=0; i<image.length; i++){ 
            start = 0; 
            end = image[i].length-1;
            
            while(start<end){
                temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            } 
            
            for(int j=0; j<image[i].length; j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
       return image; 
    }
}