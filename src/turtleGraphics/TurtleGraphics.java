package turtleGraphics;

public class TurtleGraphics {
    private Direction currentDirection = Direction.EAST;
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
}
