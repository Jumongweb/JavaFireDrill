package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner scanner = new Scanner(System.in);
    private static char playerOne;
    private static char playerTwo;

    private static char[][] board;
    public static void main(String[] args) {

        board = new char[][]{
                {' ', '|', ' ', '|',' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', ' ', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        System.out.println("WELCOME TO JUMONG TIC-TAC-TOE");
        System.out.println();
        displayGame(board);
        selectPlayer();
        startGame();
        //displayGame(board);
    }
    private static void displayGame(char[][] board){

        for (char[] row : board){
            System.out.print("\t");
            for (char column : row ){
                System.out.print(column);
            }
            System.out.println();
        }
    }
    public static void readyToPlay(){
        System.out.println("Are you ready to play: ");
        String play = scanner.nextLine().toLowerCase();

        if (play.equals("no")) System.exit(-100);
        else {
            while (!(play.equals("yes"))) {
                System.out.println("Please select yes or no");
                play = scanner.nextLine().toLowerCase();
            }
        }
    }

    public static void selectPlayer(){
        char[] playerAvatar = new char[2];
        readyToPlay();
        for (int count = 0; count < 2; count++){
            System.out.printf("Player %s Choose your avatar: 'X' or 'O' ", count + 1);
            playerAvatar[count] = scanner.next().charAt(0);
        }

        playerOne = playerAvatar[0];
        playerTwo = playerAvatar[1];

        System.out.println("Player one: " + playerOne);
        System.out.println("Player two: " + playerTwo);
    }

    public static void startGame(){
        System.out.println("To exit game, press 'q'");
        displayGame(board);
        System.out.println("Select from box 1 - 9");
        System.out.println("Choose your box: ");

        char response = scanner.next().charAt(0);

        try{
            switch (response){
                case '1' -> board[0][0] = playerOne;
                case '2' -> board[0][2] = playerTwo;
                case '3' -> board[0][4] = playerOne;
                case '4' -> board[2][0] = playerTwo;
                case '5' -> board[2][2] = playerOne;
                case '6' -> board[2][4] = playerTwo;
                case '7' -> board[4][0] = playerOne;
                case '8' -> board[4][2] = playerTwo;
                case '9' -> board[4][4] = playerOne;
                case 'q' -> System.exit(-500);
                default -> System.out.println("Oga, them swear for you. I said choose 1 - 9  to play or 'q' to quit ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            displayGame(board);
            startGame();
        }

    }

}
