package cs1302.ce26;

import java.util.Scanner;

/**
 * Tic Tac Toe Solver class
 *
 */
public class TTTSolver {

    /**
     * The entry point for the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial board state:");
        String board = input.nextLine();
        while(!TTTUtility.validGame(board)) {
            System.out.println("Invalid board. Try again.");
            board = input.nextLine();
        } // while

        //Figure out which character should go first given
        //the current configuration
        char ch = TTTUtility.whoseTurn(board);
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
    public static void printAllBoards(String board) {
        System.out.println(board);
    } // printAllBoards

} // TTTSolver
