package turtleGraphics;

public class TurtleGraphics {
    private static boolean isPenUp = true;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }
}
