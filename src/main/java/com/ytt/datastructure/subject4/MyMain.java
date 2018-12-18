package com.ytt.datastructure.subject4;

/**
 * Created by ytt on 2018/12/18.
 */
public class MyMain {

    //地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
    //例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

    /**
     *
     * @param threshold k
     * @param rows 行
     * @param cols 列
     * @return
     */
    public int movingCount(int threshold, int rows, int cols) {

        boolean[] visited = new boolean[rows * cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }

    /**
     *
     * @param threshold
     * @param rows
     * @param cols
     * @param row 当前所在
     * @param col 当前所在
     * @param visited
     * @return
     */
    private int movingCountCore(int threshold, int rows, int cols,
                                int row, int col, boolean[] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        }
        int i = row * cols + col; // 计算下标
        if (visited[i] || !checkSum(threshold, row, col)) {
            return 0;
        }
        visited[i] = true;
        return 1 + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                + movingCountCore(threshold, rows, cols, row, col - 1, visited)
                + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                + movingCountCore(threshold, rows, cols, row - 1, col, visited);
    }

    // 是否满足条件
    private boolean checkSum(int threshold, int row, int col) {
        int sum = 0;
        while (row != 0) {
            sum += row % 10; // 取个位
            row = row / 10;  // 取十位以上的数据
        }
        while (col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        if (sum > threshold) {
            return false;
        }
        return true;
    }

}
