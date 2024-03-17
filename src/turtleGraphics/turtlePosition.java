package turtleGraphics;

public class turtlePosition {

    private int row;
    private int column;

    public turtlePosition(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof turtlePosition position){
            return row == position.row && column == position.column;
        }
        return false;
    }
}
