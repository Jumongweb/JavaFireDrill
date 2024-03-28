package tikTacToe2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TicTacToe {
    private final Value_in_cells[][] ticTacToeBoard = new Value_in_cells[3][3];

    public TicTacToe(){
        for (int i = 0; i < ticTacToeBoard.length; i++){
            Arrays.fill(ticTacToeBoard[i], Value_in_cells.EMPTY);
        }

        /* for (int i = 0; i < ticTacToeBoard.length; i++){
            for (int j = 0; j < ticTacToeBoard[i].length; j++){
                ticTacToeBoard[i][j] = Value_in_cells.EMPTY;
            }
        } */
    }

    public Value_in_cells[][] getTicTacToeBoard(){
        return ticTacToeBoard;
    }

    public void displayBoard(){
        //Arrays.stream(this.getTicTacToeBoard()).map(Arrays::toString).forEach(System.out::println);

        for (int i = 0; i < getTicTacToeBoard().length; i++){
            for (int j = 0; j < getTicTacToeBoard()[i].length; j++){
                System.out.println(getTicTacToeBoard()[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Player player = new Player(1);
        Player player1 = new Player(1);

        ticTacToe.getTicTacToeBoard();
    }

}
