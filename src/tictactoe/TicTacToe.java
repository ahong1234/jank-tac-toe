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
		String line1 = "";
		for (int k = 0; k < board[0].length + board[0].length-1; k ++) {
			line1 += "-";
		}
		System.out.println(line1);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {			
				System.out.print(board[i][j]);
				if (j < board[0].length-1) {
					System.out.print("|");
				}			
			}
			String line = "";
			for (int k = 0; k < board[0].length + board[0].length-1; k ++) {
				line += "-";
			}
			System.out.println("\n" + line);		
	}
	}
	
	public static char[][] move(char[][] board, int row, int column, char symbol) {
		try { 
			board[row][column] = symbol;
			return board;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bounds");	
			return null;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		char[][] theBoard = board(3, 3);
		move(theBoard, 2, 2, 'a');
		printBoard(theBoard);
	}
}