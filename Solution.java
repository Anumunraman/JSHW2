class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;
        int i, j, m = grid[0].length, ans = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                ans = Math.max(ans, solve(grid, i, j));
            }
        }
        return ans;
    }
    
    public int solve(int[][] grid, int x, int y) {
        if (x == -1 || y == -1 || x == grid.length || y == grid[0].length || grid[x][y] == 0) return 0;
        grid[x][y] = 0;
        return solve(grid, x + 1, y) + solve(grid, x - 1, y) + solve(grid, x, y + 1) + solve(grid,x,y-1) + 1;
    }
}