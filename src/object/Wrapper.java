package object;

/**
 * Wrapper class to get the parent of each movement
 * @author hherdian
 *
 */
public class Wrapper {

	private Square child;
	private Square parent;
	
	/**
	 * Wrapper constructor to create the child square and its parent
	 */
	public Wrapper(Square found, Square latest) {
		this.child = found;
		this.parent = latest;
	}
	
	public void setChildParent(Square child, Square parent) {
		this.child = child;
		this.parent = parent;
	}
	
	public Square getChild() {
		return child;
	}
	
	public Square getParent() {
		return parent;
	}
}