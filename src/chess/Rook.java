package chess;

import boardgame.Board;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color, int moveCount) {
		super(board, color, moveCount);
		
	}

	@Override
	public String toString () {
		return "R";
	}
}
