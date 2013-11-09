package object;

/**
 * A board object that holds an 8x8 squares
 * @author hherdian
 *
 */
public class Board {

	private int i,j;
	
	private final int BOARD_WIDTH = 8;
	private final int BOARD_HEIGHT = 8;
	private Square[][] square;
	
	/**
	 * Generate a matrix of 8x8 square with the value on each index
	 */
	public Board() {
		square = new Square[BOARD_WIDTH][BOARD_HEIGHT];
		
		for(i=0; i<BOARD_WIDTH;i++) {
			for(j=0; j<BOARD_HEIGHT; j++) {
				square[i][j] = new Square(i,j);
			}
		}
	}
	
	/**
	 * Get the value of square x-coordinate and y-coordinate
	 * @param x
	 * @param y
	 * @return the square of that coordinate
	 */
	public Square getSquare(int x, int y) {
		return square[x][y];
	}
	
	/**
	 * Change the string parameter from the KnightTravails java to integer
	 * @param position
	 * @return
	 */
	public Square getSquare(String position) {
		int bufferX = position.charAt(0) - 'A';
		int bufferY = position.charAt(1) - 49;
		return getSquare(bufferX,bufferY);
	}
	
}
