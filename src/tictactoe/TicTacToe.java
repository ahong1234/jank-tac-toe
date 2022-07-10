package tictactoe;

public class TicTacToe {
	
	
	public static char[][] board(int rows, int columns) {
		
		char[][] board = new char[rows][columns];
		for (int i =0; i < rows; i ++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = '1';	
			}	
		}	
			return board;
	}
	
	
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {			
				System.out.print(board[i][j]);
				if (j < board[0].length-1) {
					System.out.print("|");
				}
			}
			if ( i < board.length -1) {
				
			}
			}	
	}
	
	
	public static void main(String[] args) {
		printBoard(board(5, 5));
	}
}