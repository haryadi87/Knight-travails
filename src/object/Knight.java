package object;

import java.util.LinkedList;

/**
 * Knight class as an extension of the piece set
 * @author hherdian
 *
 */
public class Knight extends Piece{

	/**
	 * Constructor of the knight class to define the type of piece and its starting position
	 * @param position
	 */
	public Knight(Square position) {
		super(position);
		this.type = Type.KNIGHT;
	}

	private Square squarePiece;
	
	/**
	 * Generate all valid moves of knight object in the chess board of 8x8
	 * if the board is an infinite than the "if" formula need to be adjusted
	 */
	public LinkedList<Square> validMove(Square square) {
		LinkedList<Square> move = new LinkedList<Square>();
		this.squarePiece = square;
		int initialX = squarePiece.getX();
		int initialY = squarePiece.getY();
		int longleftX = initialX - 2;
		int shortleftX = initialX - 1;
		int longRightX = initialX + 2;
		int shortRightX = initialX + 1;
		int longleftY = initialY - 2;
		int shortleftY = initialY - 1;
		int longRightY = initialY + 2;
		int shortRightY = initialY + 1;
	
		if(longRightX>-1 && longRightX<8 && shortRightY>-1 && shortRightY<8) {
			Square squarePiece = new Square(longRightX, shortRightY);
			move.add(squarePiece);
		}
		
		if(longleftX>-1 && longleftX<8 && shortRightY>-1 && shortRightY<8) {
			Square squarePiece = new Square(longleftX, shortRightY);
			move.add(squarePiece);
		}
		
		if(longRightX >-1 && longRightX <8 && shortleftY>-1 && shortleftY<8) {
			Square squarePiece = new Square(longRightX, shortleftY);
			move.add(squarePiece);
		}
		
		if(longleftX>-1 && longleftX<8 && shortleftY>-1 && shortleftY<8) {
			Square squarePiece = new Square(longleftX, shortleftY);
			move.add(squarePiece);
		}
		
		if(shortRightX >-1 && shortRightX<8 && longRightY>-1 && longRightY<8) {
			Square squarePiece = new Square(shortRightX, longRightY);
			move.add(squarePiece);
		}

		if(shortleftX >-1 && shortleftX <8 && longRightY>-1 && longRightY<8) {
			Square squarePiece = new Square(shortleftX, longRightY);
			move.add(squarePiece);
		}
		
		if(shortRightX >-1 && shortRightX <8 && longleftY>-1 && longleftY<8) {
			Square squarePiece = new Square(shortRightX, longleftY);
			move.add(squarePiece);
		}
		
		if(shortleftX >-1 && shortleftX <8 && longleftY>-1 && longleftY<8) {
			Square squarePiece = new Square(shortleftX, longleftY);
			move.add(squarePiece);
		}
		
		return move;
	}
}