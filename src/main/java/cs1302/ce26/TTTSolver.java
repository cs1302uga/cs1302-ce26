package cs1302.ce26;

import java.util.Scanner;
import cs1302.ttt.TTTUtility;

/**
 * Tic Tac Toe Solver class
 *
 */
public class TTTSolver {

    /**
     * The entry point for the program.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial board state:");
        String board = input.nextLine();
        while(board.length() != 9 || !TTTUtility.validGame(board)) {
            System.out.println("Invalid board. Try again.");
            board = input.nextLine();
        }
        System.out.println("Enter the position (0-8) for your move:");
        int move = input.nextInt();
        while(board.charAt(move) != '-') {
            System.out.println("That spot is already taken. Try again:");
            move = input.nextInt();
        }
        //Add player's move using the appropriate character:
        char ch = TTTUtility.whoseTurn(board);
        System.out.println(ch + " turn");
        board = board.substring(0, move) + ch + board.substring(move + 1);
        printAllBoards(board);
    } // main

    /**
     * Given an initial board state, this method prints
     * all board states that could result. It includes 
     * intermediate board states as well as complete
     * board states (where all spots are filled).
     *
     * @param board the game board
     */
    private static void printAllBoards(String board){

    }

} // TTTSolver
