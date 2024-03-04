package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner scanner = new Scanner(System.in);

    private Symbol symbol = Symbol.EMPTY;

    private static Player player1 = new Player();
    private static Player player2 = new Player();

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

        startGame();
        readyToPlay();
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

//    public static void selectPlayer(){
//        char[] playerAvatar = new char[2];
//        readyToPlay();
//        try{
//            for (int count = 0; count < 2; count++){
//                if (count == 1) System.out.println("PlayerOne selected " + playerAvatar[0]);
//                System.out.printf("Player %s Choose your avatar: 'X' or 'O': ", count + 1);
//                playerAvatar[count] = scanner.next().charAt(0);
//            }
//            if (playerAvatar[0] == playerAvatar[1]){
//                throw new SameAvatarError("Oga, you suppose get sense ooo, why will you select the same thing with player one");
//            }
//        } catch (SameAvatarError e){
//            System.out.println(e);
//        }
//
//        playerOne = playerAvatar[0];
//        playerTwo = playerAvatar[1];
//
//        System.out.println("Player one: " + playerOne);
//        System.out.println("Player two: " + playerTwo);
//    }

    public static void startGame(){
        System.out.println("To exit game, press 'q'");
        displayGame(board);
        System.out.println("Select from box 1 - 9");
        System.out.println("Choose your box: ");

        char response = scanner.next().toUpperCase().charAt(0);

        try{
//            switch (response){
//                case '1' -> board[0][0] = player1.getSymbol();
//                case '2' -> board[0][2] = player2.getSymbol();
//                case '3' -> board[0][4] = player1.getSymbol();
//                case '4' -> board[2][0] = player2.getSymbol();
//                case '5' -> board[2][2] = player1.getSymbol();
//                case '6' -> board[2][4] = player2.getSymbol();
//                case '7' -> board[4][0] = player1.getSymbol();
//                case '8' -> board[4][2] = player2.getSymbol();
//                case '9' -> board[4][4] = player1.getSymbol();
//                case 'q' -> System.exit(-500);
//                default -> System.out.println("Oga, them swear for you. I said choose 1 - 9  to play or 'q' to quit ");
//            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            displayGame(board);
            startGame();
        }
    }

    public Symbol playerChoice(){
        char[] playerAvatar = new char[2];
        try{
            for (int count = 0; count < 2; count++){
                if (count == 1) System.out.println("PlayerOne selected " + playerAvatar[0]);
                System.out.printf("Player %s Choose your avatar: 'X' or 'O': ", count + 1);
                playerAvatar[count] = scanner.next().toUpperCase().charAt(0);
            }

            if (playerAvatar[0] == 'X'){
                symbol = Symbol.X;
            } else if (playerAvatar[0] == 'O') {
                symbol = Symbol.O;
            }
            else {
                System.out.println("please select 'X' or 'O' ");
            }

            if (playerAvatar[1] == 'X'){
                symbol = Symbol.X;
            } else if (playerAvatar[1] == 'O') {
                symbol = Symbol.O;
            }

            if (player1.getSymbol() == player2.getSymbol()){
                throw new SameAvatarError("Oga, you suppose get sense ooo, why will you select the same thing with player one");
            }
        } catch (SameAvatarError e){
            System.out.println(e);
        }

        System.out.println("Player one: " + player1.getSymbol());
        System.out.println("Player two: " + player2.getSymbol());

        return symbol;
    }


}