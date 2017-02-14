package com.doggeddev;

import java.util.Stack;

/**
 * Created by richd_000 on 2/13/2017.
 */
public class PathFinder {

	private Board board;
	private Stack<int[]> pathFound = new Stack<int[]>();
	private int startPositionRow = 0;
	private int startPositionCol = 0;
	private int endPositionRow = 0;
	private int endPositionCol = 0;

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

	void drawVisited() {
		board.drawBoard(board.getVisited());

	}

	void drawBoard()

	{
		board.drawBoard(board.getBoard());
	}

	void startSearch(int[] tempStartPosition) {
		System.out.println("at start search");

		int[] startposition = tempStartPosition; //{startPositionRow, startPositionCol};
		searchLoop(startposition);
	}

	private void search(int[] currentPosition) {

		int currentRow = currentPosition[0];
		int currentCol = currentPosition[1];
		int rowOffset = 0;
		int colOffset = 0;

		switch (currentRow) {
			case 0:
				break;
			case 9:
				break;
			default:
				rowOffset = 1;
		}

		switch (currentCol) {
			case 0:
				break;
			case 9:
				break;
			default:
				colOffset = 1;
		}


		search(checkNorth(currentRow - rowOffset, rowOffset, currentCol, colOffset));


	}

	private int[] checkNorth(int row, int rowOffset, int currentRow, int currentCol) {


		return null;
	}

	private int[] checkSouth(int currentRow, int currentCol) {

		return null;
	}

	private int[] checkEast(int currentRow, int currentCol) {


		return null;
	}

	private int[] checkWest(int currentRow, int currentCol) {


		return null;
	}
}


