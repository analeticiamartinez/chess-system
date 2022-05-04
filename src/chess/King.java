package chess;

import boardgame.Board;

public class King extends ChessPiece {

	public King(Board board, Color color, int moveCount) {

		super(board, color, moveCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}

}
