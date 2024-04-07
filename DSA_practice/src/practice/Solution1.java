package practice;

public class Solution1 {
    public static void main(String[] args) {
        int[][] grid1 = {
                {2, 4, 3, 5},
                {5, 4, 9, 3},
                {3, 4, 2, 11},
                {10, 9, 13, 15}
        };

        int result1 = maxMoves(grid1);
        System.out.println("Max number of moves: " + result1);


    }

    public static int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int col = n - 2; col >= 0; col--) {
            for (int row = 0; row < m; row++) {
                int current = grid[row][col];
                int maxMoves = 0;

                // Check the three possible moves
                for (int i = -1; i <= 1; i++) {
                    int newRow = row + i;
                    if (newRow >= 0 && newRow < m && grid[newRow][col + 1] > current) {
                        maxMoves = Math.max(maxMoves, dp[newRow][col + 1]);
                    }
                }

                dp[row][col] = 1 + maxMoves;
            }
        }

        int maxResult = 0;
        for (int i = 0; i < m; i++) {
            maxResult = Math.max(maxResult, dp[i][0]);
        }

        return maxResult;
    }
}
