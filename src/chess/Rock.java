package chess;

import boardgame.Board;

public class Rock extends ChessPiece {

	public Rock(Board board, Color color, int moveCount) {
		super(board, color, moveCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "R";
	}
}
