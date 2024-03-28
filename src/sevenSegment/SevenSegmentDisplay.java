package sevenSegment;

public class SevenSegmentDisplay {
    public static int[][] board = new int[5][4];

    public static void main(String[] args) {
        SevenSegmentDisplay seg = new SevenSegmentDisplay("11111111");
        seg.displayBoard();
        System.out.println(board[0][0]);
    }

    private String lightSwitch;
    public SevenSegmentDisplay(String input) {
        // practising git checkout1
        // This should not be here
        this.lightSwitch = input;
        for (int i = 0; i < 5;  i++) {
            if (lightSwitch.charAt(0) == '1' && lightSwitch.charAt(7) == '1') {
                this.board[0][0] = 1;
            }

            if (lightSwitch.charAt(1) == 1 && lightSwitch.charAt(7) == 1) {
                this.board[0][1] = 1;
            }
        }
    }

    public void displayBoard() {
        System.out.print("Board");

        if (lightSwitch.charAt(0) == 1 && lightSwitch.charAt(7) == 1) {
            this.board[0][0] = 1;
        }

        if (lightSwitch.charAt(1) == 1 && lightSwitch.charAt(7) == 1) {
            this.board[0][1] = 1;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == '1') System.out.print("* ");

                if (this.lightSwitch.charAt(1) == '1') System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(2) == 1) System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(3) == 1) System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(4) == 1) System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(5) == 1) System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(6) == 1) System.out.print("* ");
                else System.out.println(" ");
                if (this.lightSwitch.charAt(7) == 1) System.out.print("* ");
                else System.out.println(" ");
                System.out.println();
            }
        }
    }
}