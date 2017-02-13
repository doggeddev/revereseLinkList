package com.doggeddev;

import java.util.Stack;

/**
 * Created by richd_000 on 2/13/2017.
 */
public class PathFinder {

	private Board board;
	private Stack<Integer[][]> pathFound = new Stack<>();
	int startPositionRow = 0;
	int startPositionCol = 0;
	int endPositionRow = 0;
	int endPositionCol = 0;

	PathFinder(int x, int y) {
		board = new Board(x, y);

	}

	void setStartingPosition(int row, int col) {
		startPositionCol = col;
		startPositionRow = row;

		board.setValueAtPosition(startPositionRow, startPositionCol, 'S');
		board.setVisited(startPositionRow, startPositionCol, true);
	}

	void setEndPosition(int row, int col) {
		endPositionRow = row;
		endPositionCol = col;
		board.setValueAtPosition(endPositionRow, endPositionCol, 'E');
		board.setVisited(endPositionRow, endPositionCol, false);
	}


	void fillBoardWithRandomPath()

	{
		board.fillWithRandomValues();
	}

	void drawVisited()

	{
		board.drawBoard(board.getVisited());
	}

	void drawBoard()

	{
		board.drawBoard(board.getBoard());
	}


	void startSearch() {

		int currentRow = startPositionRow;
		int currentCol = startPositionCol;

		searchLoop(currentRow, currentCol);

	}

	private void searchLoop(int currentRow, int currentCol) {
		checkNorth(currentRow, currentCol);
		checkSouth(currentRow, currentCol);
		checkEast(currentRow, currentCol);
		checkWest(currentRow, currentCol);
	}


	private void checkNorth(int currentRow, int currentCol) {
		if (currentRow > 0) {
			if (board.getPathAvailable(currentRow - 1, currentCol)) {
				searchLoop(currentRow - 1, currentCol);
			}
		}

	}

	private void checkSouth(int currentRow, int currentCol) {
		if (currentRow < board.getRowLength() - 1) {
			if (board.getPathAvailable(currentRow + 1, currentCol)) {
				searchLoop(currentRow + 1, currentCol);
			}
		}

	}

	private void checkEast(int currentRow, int currentCol) {
		if (currentCol < board.getColLength() - 1) {
			if (board.getPathAvailable(currentRow, currentCol + 1)) {
				searchLoop(currentRow, currentCol + 1);
			}
		}

	}

	private void checkWest(int currentRow, int currentCol) {
		if (currentCol > 0) {
			if (board.getPathAvailable(currentRow, currentCol - 1)) {
				searchLoop(currentRow, currentCol - 1);
			}
		}

	}


}


