package search;

import java.util.LinkedList;

import object.Piece;
import object.Square;
import object.Wrapper;

/**
 * The core class to identify the knight moves
 * @author hherdian
 *
 */
public class BFSSearch {
	//A linked list to holds the queueing data of knight movement
	private LinkedList<Wrapper> queue = new LinkedList<Wrapper>();
	//A Linked list to holds all paths that have been identified
	private LinkedList<Wrapper> visited = new LinkedList<Wrapper>();
	
	private Square buffer;
	private Square startSquare;
	private Square endSquare;
	private Piece piece;
	
	/**
	 * Constructor class to assign the starting position, ending position and the chess piece type
	 * @param start
	 * @param end
	 * @param piece
	 */
	public BFSSearch(Square start, Square end, Piece piece) {
		this.startSquare = start;
		this.endSquare = end;
		this.piece = piece;
	}	
	
	/**
	 * Search method to generate the shortest sequence path of the knight piece
	 */
	public void generateAction() {
		queue.add(new Wrapper(startSquare, null));
		while(!queue.isEmpty()) {
			//retrieve the first data on the queue
			buffer = queue.poll().getChild();
			//If the data is the one that we are looking for, generate the path 
			if(compare(buffer)) {
				reconstructPath(visited, buffer);
				break;
			}
			
			//Generate all possible movement based on the given starting position
			for(Square s: piece.validMove(buffer))	{
				if(!visited.contains(s)) {
					//add all possible path into queue variable to be search on next iteration
					queue.add(new Wrapper(s,buffer));
					//add all possible path into visited variable to hold all square that we have identified
					visited.add(new Wrapper(s,buffer));
				}
			}
		}
	}
	
	/**
	 * Method to compare whether the target have been found or not
	 * @param square
	 * @return
	 */
	public boolean compare(Square square) {
		return (square.getX() == endSquare.getX() && square.getY() == endSquare.getY());
	}
	
	/**
	 * Using wrapper class, reconstruct the path of the result
	 * @param path
	 * @param result
	 */
	public void reconstructPath(LinkedList<Wrapper> path, Square result) {
		int index = 0;
		Square buffer = result;
		LinkedList<Square> travails = new LinkedList<Square>();
		if(buffer != startSquare) {
			while(buffer!= startSquare) {
				for(Wrapper s: path) {
					if(buffer == s.getChild()) {
						break;
					}
					else{
						index++;
					}
				}
				buffer = path.get(index).getChild();
				travails.addFirst(buffer);
				buffer = path.get(index).getParent();
				index = 0;
			}
		}
		else if(buffer == startSquare) {
			travails.add(startSquare);
		}
		System.out.println(travails);
	}
}
