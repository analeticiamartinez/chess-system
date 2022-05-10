package chess;

import boardgame.Board;
import boardgame.Position;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColunms()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColunms(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE, 1));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE, 1));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE, 1));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE, 1));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE, 1));
        placeNewPiece('d', 1, new King(board, Color.WHITE, 1));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK, 1));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK, 1));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK, 1));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK, 1));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK, 1));
        placeNewPiece('d', 8, new King(board, Color.BLACK, 1));
	}
}
