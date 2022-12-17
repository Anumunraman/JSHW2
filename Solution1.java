class Solution1 {
    int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image,sr,sc,image[sr][sc],newColor,visited);
        return image;
    }
    
    public void dfs(int[][] image,int x,int y,int oldColor,int newColor,boolean[][] visited){
        if(x<0 || x>=image.length || y<0 || y>=image[0].length){
            return;
        }
        
        if(visited[x][y]==true || image[x][y]!=oldColor){
            return;
        }
        
        visited[x][y] = true;
        image[x][y] = newColor;
        for(int[] dir:dirs){
            int i=x+dir[0];
            int j=y+dir[1];
            dfs(image,i,j,oldColor,newColor,visited);
        }
    }
}