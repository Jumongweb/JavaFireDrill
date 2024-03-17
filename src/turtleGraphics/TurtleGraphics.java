package turtleGraphics;

public class TurtleGraphics {
    private Direction currentDirection = Direction.EAST;

    private turtlePosition currentPosition = new turtlePosition(0,0);
    private boolean isPenUp = true;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public turtlePosition getCurrentPosition(){
        return currentPosition;
    }

    public Direction currentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
//        switch (currentDirection) {
//            case EAST -> currentDirection = Direction.NORTH;
//            case NORTH -> currentDirection = Direction.WEST;
//            case WEST -> currentDirection = Direction.SOUTH;
//            case SOUTH -> currentDirection = Direction.EAST;
//        }
    }


    public void turnRight() {
        currentDirection = currentDirection.turnRight();
//        switch (currentDirection){
//            case EAST -> currentDirection = Direction.SOUTH;
//            case SOUTH -> currentDirection = Direction.WEST;
//            case WEST -> currentDirection = Direction.NORTH;
//            case NORTH -> currentDirection = Direction.EAST;
//        }
    }

    public void moveForward(int numberOfStep, SketchBoard sketchBoard) {
        if (!isPenUp) drawOnBoard(sketchBoard, numberOfStep);
        switch (currentDirection){
            case EAST -> moveForwardViaEast(numberOfStep);
            case SOUTH -> moveForwardViaSouth(numberOfStep);
            case WEST -> moveForwardViaWest(numberOfStep);
            case NORTH -> moveForwardViaNorth(numberOfStep);

        }
    }

    private void drawOnBoard(SketchBoard sketchBoard, int numberOfSteps) {
        int[][] floorBoard = sketchBoard.getBoard();

        switch (currentDirection) {
            case EAST:
                markEastWard(floorBoard, numberOfSteps);
                break;
            case SOUTH:
                markSouthWard(floorBoard, numberOfSteps);
                break;
            case WEST:
                markWestWard(floorBoard, numberOfSteps);
                break;
            case NORTH:
                markNorthWard(floorBoard, numberOfSteps);
                break;
        }
    }


    private void moveForwardViaNorth(int numberOfStep) {
        int newRow = numberOfStep - currentPosition.getRow() - 1 ;
        int newColumn = currentPosition.getColumn();
        currentPosition = new turtlePosition(newRow, newColumn);

    }

    private void moveForwardViaWest(int numberOfStep) {
        int newRow = currentPosition.getRow() ;
        int newColumn = numberOfStep - currentPosition.getColumn() - 1 ;
        currentPosition = new turtlePosition(newRow, newColumn);

    }

    private void moveForwardViaSouth(int numberOfStep) {
        int newRow = currentPosition.getRow() + numberOfStep - 1;
        int newColumn = currentPosition.getColumn() ;
        currentPosition = new turtlePosition(newRow, newColumn);
    }

    private void moveForwardViaEast(int numberOfSteps) {
        int newRow = currentPosition.getRow() ;
        int newColumn = currentPosition.getColumn() + numberOfSteps - 1;
        currentPosition = new turtlePosition(newRow, newColumn);
    }


    private void markNorthWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int columnCheck = 0; columnCheck < numberOfSteps; columnCheck++) {
            floorBoard[row - columnCheck][column] = 1;
        }
    }

    private void markWestWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int rowCheck = 0; rowCheck < numberOfSteps; rowCheck++) {
            floorBoard[row][column - rowCheck] = 1;
        }
    }

    private void markSouthWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int rowCheck = 0; rowCheck < numberOfSteps; rowCheck++) {
            floorBoard[row + rowCheck][column] = 1;
        }
    }

    private void markEastWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int columnCheck = 0; columnCheck < numberOfSteps; columnCheck++) {
            floorBoard[row][column + columnCheck] = 1;
        }
    }

}
