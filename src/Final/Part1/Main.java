package Final.Part1;

public class Main {

    public enum Direction { UP, DOWN, LEFT, RIGHT };

    public static void main (String args[]){

        int[][] room = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,-1}
        };
        Roomba roomba = new Roomba(new int[3][3], Main.Direction.DOWN);
        roomba.move();
    }
}
