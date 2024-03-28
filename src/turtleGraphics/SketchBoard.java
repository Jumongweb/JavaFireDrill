package turtleGraphics;

public class SketchBoard {
    private final int[][] sketchBoard =new int[20][20];

    public int[][] getBoard() {
        return sketchBoard;
    }

    public void display() {
        for (int row = 0; row < 20; row++) {
            for (int column=0; column < 20; column++) {
                if (sketchBoard[row][column] == 1) System.out.print("* ");
                if (sketchBoard[row][column] == 0) System.out.print("  ");

            }
            System.out.println();
        }
    }

}