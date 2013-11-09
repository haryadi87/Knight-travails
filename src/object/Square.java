package object;

/**
 * A Square class that holds the chess set
 * Two attributes are define: x and y coord. These attributes represent the chess position
 * @author hherdian
 *
 */
public class Square {
	private int xCoord;
	private int yCoord;

	/**
	 * Square constructor to create the coord
	 * @param i
	 * @param j
	 */
	public Square(int i, int j) {
		this.xCoord=i;
		this.yCoord=j;
	}
	public void setXY(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}
	public int getX() {
		return xCoord;
	}
	public int getY() {
		return yCoord;
	}
	
	@Override
	public String toString() {
		String coordinate = new String();
		coordinate = String.valueOf((char)(xCoord + 'A'))+ Integer.toString(yCoord+1);
		return coordinate;
	}
}
