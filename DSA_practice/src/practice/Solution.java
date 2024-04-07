package practice;

public class Solution {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        int maxMoves = 0;


        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

            // Perform dynamic programming to calculate the maximum number of moves.
        for (int col = 1; col < n; col++) {
            for (int row = 0; row < m; row++) {
                int currentCell = grid[row][col];
                dp[row][col] = 1; // Initialize to 1 move (the minimum).

                for (int r = -1; r <= 1; r++) {
                    for (int c = -1; c <= 1; c++) {
                        if (row + r >= 0 && row + r < m && col + c > 0 && col + c < n) {
                            int nextCell = grid[row + r][col + c];
                            if (nextCell > currentCell) {
                                dp[row][col] = Math.max(dp[row][col], dp[row + r][col + c] + 1);
                            }
                        }
                    }
                }
                maxMoves = Math.max(maxMoves, dp[row][col]);
            }
        }

        return maxMoves;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {2, 4, 3, 5},
                {5, 4, 9, 3},
                {3, 4, 2, 11},
                {10, 9, 13, 15}
        };

        Solution solution = new Solution();
        System.out.println(solution.maxMoves(grid1)); // Output: 3
    }
}