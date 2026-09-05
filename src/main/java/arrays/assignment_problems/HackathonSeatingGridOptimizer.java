package arrays.assignment_problems;

public class HackathonSeatingGridOptimizer {

    static int[] findBestRow(int[][] grid) {
        int bestRow = 0;
        int bestSum = 0;

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;

            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }

            if (sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }

        return new int[]{bestRow, bestSum};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {10, 20, 15},
            {25, 30, 20},
            {15, 10, 25}
        };

        int[] result = findBestRow(grid);

        System.out.println("Best row: " + (result[0] + 1));
        System.out.println("Total score: " + result[1]);
    }
}
