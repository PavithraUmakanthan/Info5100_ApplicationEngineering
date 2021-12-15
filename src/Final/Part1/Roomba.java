package Final.Part1;

import apple.laf.JRSUIConstants;

public class Roomba implements iRobot {
    public int row;
    public int col;
    public final int[][] room;
    public Main.Direction dir;

    public Roomba(int[][] matrix, Main.Direction dir) {
        this.room = matrix;
        this.dir = dir;
    }

    @Override
    public final boolean move() {
        if (room[row][col] == 0 || room[row][col] == 1) {
            if (dir == Main.Direction.UP && row > 0) {
                row = row - 1;
                col = col;
            } else if (dir == Main.Direction.DOWN && row < 2) {
                row = row + 1;
                col = col;
            } else if (dir == Main.Direction.LEFT && col > 0) {
                row = row;
                col = col - 1;
            } else if (dir == Main.Direction.RIGHT && col < 2) {
                row = row;
                col = col + 1;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final void turnLeft() {
        if (dir == Main.Direction.DOWN) {
            dir = Main.Direction.LEFT;
        } else if (dir == Main.Direction.LEFT) {
            dir = Main.Direction.UP;
        } else if (dir == Main.Direction.UP) {
            dir = Main.Direction.RIGHT;
        } else if (dir == Main.Direction.RIGHT) {
            dir = Main.Direction.DOWN;
        }

    }

    @Override
    public final void turnRight() {
        if (dir == Main.Direction.DOWN) {
            dir = Main.Direction.RIGHT;
        } else if (dir == Main.Direction.RIGHT) {
            dir = Main.Direction.UP;
        } else if (dir == Main.Direction.UP) {
            dir = Main.Direction.LEFT;
        } else if (dir == Main.Direction.LEFT) {
            dir = Main.Direction.DOWN;
        }
    }

    @Override
    public final void clean() {
        if (room[row][col] == 0) {
            room[row][col] = 1;
        }
    }
}
