class MazeSolver {

    static boolean findPath(int[][] grid, int row, int col) {

        int n = grid.length;

        if (row >= n || col >= n || grid[row][col] == 0) {
            return false;
        }

        if (row == n - 1 && col == n - 1) {
            return true;
        }

        grid[row][col] = 0;

        return findPath(grid, row, col + 1) ||
               findPath(grid, row + 1, col);
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 1}
        };

        if (findPath(grid, 0, 0))
            System.out.println("True");
        else
            System.out.println("Move Right or Down");
    }
}
