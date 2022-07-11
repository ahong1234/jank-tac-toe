package tictactoe;

import java.util.Scanner;

public class dynamicBoard {
	
	public static char[][] makeBoard(int rows, int columns) {
		char[][] board = new char[rows][columns];
		for (int i = 0; i < board.length;i++) {
			for(int j = 0; j < board[i].length; j ++) {
				board[i][j] = ' ';
			}
		}
		return board;
	}
	
	public static String drawBoard(char[][] array) { 
		String board = "";
		String dashes = "";
		for (int k =0; k < array[0].length + array[0].length - 1; k++) {
			dashes+="-";
		}
		board+=dashes + "\n";
		
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) { 
				if (j < array[i].length-1)
					board +=  array[i][j] + "|";	
				else 
					board += array[i][j];		
		}
		dashes = "";
		for (int k =0; k < array[0].length + array[0].length - 1; k++) {
			dashes+="-";
		}
		board+="\n"+ dashes;
		board+="\n";
		
		}
		System.out.println("here is your board");
		return board;
	}
	
	public static Boolean isFull(char[][] board) {
		Boolean flag = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != ' ')
					flag= true;
					return flag;
			}
			
		}
		return flag;
	}
	
	public static Boolean checkColumns(char[][] board) {
		Boolean flag = false;
		for (int i =0; i < board.length; i ++ ) {	
			if(board[i][i] == 'X') {
				flag = true;
			}
		}
		return flag;
	}
	
	
	
	public static void makeMove(char[][] board, int row, int column, char marker) {
		if (board[row][column] == ' ') { 
			board[row][column] = marker;
		}
		else {
			System.out.println("space occupied");
		}
		System.out.println(drawBoard(board));
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("How many rows?");
		int rows = stdin.nextInt();
		System.out.println("How many columns?");
		int columns = stdin.nextInt();
		System.out.println();
		char[][] board = makeBoard(rows, columns);
		System.out.println(drawBoard(board));
		
		System.out.println("Where do you want to move?");
		Boolean flag = false;
		while (!flag) {
			System.out.println("Which row?");
			int row = stdin.nextInt();
			
			System.out.println("Which column?");
			int column = stdin.nextInt();
			makeMove(board, row, column, 'X');
			if (isFull(board)) {
				flag = true;
			}
			else if (checkColumns(board)) {
				flag = true;
			}
		}
		System.out.println("board full");
	}
}
