package com.doggeddev;

public class Main {

	public static void main(String[] args) {


		PathFinder pathTest = new PathFinder(10, 10);
		pathTest.fillBoardWithRandomPath();
		pathTest.setEndPosition(9, 9);
		pathTest.setStartingPosition(0, 0);
		pathTest.drawBoard();
		//pathTest.drawVisited();

		int[] tempStartPosition = {1,0};
		pathTest.startSearch(tempStartPosition);

	}

}
