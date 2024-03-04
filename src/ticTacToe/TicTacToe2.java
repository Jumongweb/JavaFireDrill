package ticTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe2 {
    private static Scanner scanner = new Scanner(System.in);

    private Symbol symbol = Symbol.EMPTY;

    private static Player player1 = new Player();
    private static Player player2 = new Player();

    private static Symbol[][] board;
    public static void main(String[] args) {

        board = new Symbol[3][3];

        fill(board);
        welcomeMessage();
        selectPlayer();
        startGame();
    };

    public static void startGame(){
        displayGame(board);


        System.out.println("Select from box 1 - 9");
        System.out.println("Choose your box: ");

        char response = scanner.next().toUpperCase().charAt(0);

        try{
            switch (response){
                case '1' -> board[0][0] = player1.getSymbol();
                case '2' -> board[0][1] = player2.getSymbol();
                case '3' -> board[0][2] = player1.getSymbol();
                case '4' -> board[1][0] = player2.getSymbol();
                case '5' -> board[1][1] = player1.getSymbol();
                case '6' -> board[1][2] = player2.getSymbol();
                case '7' -> board[2][0] = player1.getSymbol();
                case '8' -> board[2][1] = player2.getSymbol();
                case '9' -> board[2][2] = player1.getSymbol();
                case 'Q' -> System.exit(-500);
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



    private static void displayGame(Symbol[][] board){

        //if (board[0])
        System.out.println("\t" + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("\t----+++----+++----");
        System.out.println("\t" + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("\t----+++----+++----");
        System.out.println("\t" + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

//        for (Symbol[] row : board){
//            System.out.print("\t");
//            for (Symbol column : row ){
//                System.out.print(column + "|");
//            }
//
//            System.out.println();
//        }
    }

    private static void fill(Symbol[][] board) {
        for (Symbol[] row : board) {
            Arrays.fill(row, Symbol.EMPTY);
        }
    }

    public static void selectPlayer(){
        char[] playerAvatar = new char[2];
        try{
            for (int count = 0; count < 2; count++){
                if (count == 1) System.out.println("PlayerOne selected " + playerAvatar[0]);
                System.out.printf("Player %s Choose your avatar: 'X' or 'O': ", count + 1);
                playerAvatar[count] = scanner.next().toUpperCase().charAt(0);

            }

            if (playerAvatar[0] == playerAvatar[1]){
                throw new SameAvatarError("Oga, you suppose get sense ooo, why will you select the same thing with player one");
            }
        } catch (SameAvatarError e){
            System.out.println(e);
            selectPlayer();
        }

        if (playerAvatar[0] == 'X'){
            player1.setSymbol(Symbol.X);
        }
        else if (playerAvatar[1] == 'O'){
            player1.setSymbol(Symbol.O);
        }
        else if (!(player1.getSymbol() == Symbol.X) || !(player1.getSymbol() == Symbol.O)){
            System.out.println("Can't you read. I told you before that choose 'X' or 'O'. Since you want to stress me, your punishment is to start the game all over again");
            System.exit(-1000);
        }

        if (playerAvatar[1] == 'O'){
            player1.setSymbol(Symbol.O);
        }
        else if (playerAvatar[1] == 'X'){
            player1.setSymbol(Symbol.X);
        }
        else if (!(player2.getSymbol() == Symbol.X) || !(player2.getSymbol() == Symbol.O)){
            System.out.println("Can't you read. I told you before that choose 'X' or 'O'. Since you want to stress me, your punishment is to start the game all over again");
            System.exit(-1000);
        }

    }

    public static void welcomeMessage(){
        System.out.println("WELCOME TO JUMONG TIC-TAC-TOE");
        System.out.println("To exit game, press 'q'");
    }



}