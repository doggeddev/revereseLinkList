package com.doggeddev;

import java.util.Random;


/**
 * Created by richd_000 on 2/13/2017.
 */
class Board {

	private int row = 0;
	private int col = 0;
	private char[][] board;
	private boolean[][] visited;
	private char path = ' ';
	private char blocked = 'X';

	Board(int row, int col) {

		this.row = row;
		this.col = col;

		visited = new boolean[row][col];
		board = new char[row][col];

		initBoard();
	}

	char[][] getBoard() {
		return board;
	}

	Board fillWithRandomValues() {
		Random randRow = new Random();
		Random randCol = new Random();

		for (int i = 0; i < (row * col); i++) {
			setValueAtPosition(randRow.nextInt(row), randCol.nextInt(col), ' ');
		}
		return this;
	}


	Board setValueAtPosition(int row, int col, char c) {
		this.board[row][col] = c;
		return this;
	}

	Board setVisited(int row, int col, boolean visited) {
		this.visited[row][col] = visited;
		return this;
	}

	private void initBoard() {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				board[i][j] = blocked;
				visited[i][j] = false;
			}
		}
	}

	void drawBoard(char[][] boardToDraw) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < col; i++) {
			sb.append("[ |");
			for (int j = 0; j < col; j++) {
				sb.append(boardToDraw[i][j]).append(" | ");
			}
			sb.append("]\n");

		}
		System.out.println(sb.toString());
	}

	void drawBoard(boolean[][] boardToDraw) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < col; i++) {
			sb.append("[ |");
			for (int j = 0; j < col; j++) {
				sb.append(boardToDraw[i][j]).append(" | ");
			}
			sb.append("]\n");

		}
		System.out.println(sb.toString());
	}


	boolean getPathAvailable(int currentRow, int currentCol) {
		try {
			if (board[currentRow][currentCol] == blocked) {
				return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	int getRowLength() {
		return row;
	}

	int getColLength() {
		return col;
	}

	public boolean getPositionVisitStatus(int currentRow, int currentCol) {
		return visited[currentRow][currentCol];
	}

	public boolean[][] getVisited() {
		return visited;
	}

}