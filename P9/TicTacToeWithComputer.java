package P9;

import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        
        // Initialize the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        
        boolean gameWon = false;
        boolean playerTurn = true; // Player goes first
        
        while (!gameWon && !isBoardFull(board)) {
            // Display the board
            displayBoard(board);
            
            if (playerTurn) {
                // Player's turn
                System.out.println("Player's turn");
                System.out.print("Enter a row (0, 1 or 2): ");
                int row = scanner.nextInt();
                System.out.print("Enter a column (0, 1 or 2): ");
                int col = scanner.nextInt();
                
                // Check if the move is valid
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    playerTurn = false;
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
            } else {
                // Computer's turn
                System.out.println("Computer's turn");
                int row, col;
                do {
                    row = (int)(Math.random() * 3);
                    col = (int)(Math.random() * 3);
                } while (board[row][col] != ' ');
                
                board[row][col] = 'O';
                System.out.println("Computer chose row " + row + ", column " + col);
                playerTurn = true;
            }
            
            // Check for winner
            if (checkWinner(board, 'X')) {
                displayBoard(board);
                System.out.println("Player wins!");
                gameWon = true;
            } else if (checkWinner(board, 'O')) {
                displayBoard(board);
                System.out.println("Computer wins!");
                gameWon = true;
            }
        }
        
        if (!gameWon) {
            displayBoard(board);
            System.out.println("It's a draw!");
        }
        
        scanner.close();
    }
    
    // Method to display the board
    public static void displayBoard(char[][] board) {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }
    
    // Method to check if the board is full
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Method to check for a winner
    public static boolean checkWinner(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        
        return false;
    }
}
