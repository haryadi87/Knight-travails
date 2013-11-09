import java.util.Scanner;

import object.Board;
import object.Knight;
import object.Piece;
import object.Square;
import search.BFSSearch;

/**
 * Main class of the knight travails
 * @author hherdian
 *
 */
public class KnightTravails {
	//Create a final chess board to check whether input string is correct or not
	public static final String[] CHESSBOARD = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8",
											   "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8",
											   "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8",
											   "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8",
											   "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8",
											   "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8",
											   "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8",
											   "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8"};
	public static void main(String[] arg0) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter input");
		String input = scanner.nextLine();
		String[] knightPost = input.toUpperCase().split(" ");
		//Check if input is valid or not
		if(checkInput(knightPost[0], knightPost[1])) {
			Board board = new Board();
			Square startSquare = board.getSquare(knightPost[0]);
			Square endSquare = board.getSquare(knightPost[1]);
			Piece knight = new Knight(startSquare);
			BFSSearch search = new BFSSearch(startSquare,endSquare,knight);
			search.generateAction();
		}
		else
			System.out.println("Invalid input");
	}

	/**
	 * Compare the begin string and the end string of user input with the final CHESSBOARD variable
	 * @param begin
	 * @param end
	 * @return false if the input is invalid
	 */
	public static boolean checkInput(String begin, String end) {
		boolean checkInput = false;
		boolean checkOutput = false;
		for (String chess: CHESSBOARD) {
			if(begin.equalsIgnoreCase(chess) ) {
				checkInput = true;
			}
		}
		for (String chess: CHESSBOARD) {
			if(end.equalsIgnoreCase(chess) ) {
				checkOutput = true;
			}
		}
		return (checkInput && checkOutput);
	}
}
