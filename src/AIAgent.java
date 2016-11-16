import java.util.*;

import javax.swing.JOptionPane;

public class AIAgent {
	Random rand;

	public AIAgent() {
		rand = new Random();
	}

	/*
	 * The method randomMove takes as input a stack of potential moves that the
	 * AI agent can make. The agent uses a rondom number generator to randomly
	 * select a move from the inputted Stack and returns this to the calling
	 * agent.
	 */

	public Move randomMove(Stack possibilities) {
		int moveID = rand.nextInt(possibilities.size());
		System.out.println("Agent randomly selected move : " + moveID);
		for (int i = 1; i < (possibilities.size() - (moveID)); i++) {
			possibilities.pop();
		}
		Move selectedMove = (Move) possibilities.pop();
		return selectedMove;
	}

	public Move nextBestMove(Stack<Move> possibilities, Stack<Square> allBlackSquares) {
		Iterator<Move> iter = possibilities.iterator();
		while (iter.hasNext()) {
			Square s = iter.next().getLanding();
			int x = s.getXC();
			int y = s.getYC();
			Iterator<Square> iter2 = allBlackSquares.iterator();
			while (iter2.hasNext()) {
				Square s2 = iter2.next();
				int x2 = s2.getXC();
				int y2 = s2.getYC();
				String test = s2.getName();
				// System.out.println("piece name is "+test+" xcoord of piece is
				// "+s2.getXC()+" and y coords are "+s2.getYC());
				if ((x == x2) && (y == y2)) {
					if (s2.getName().contains("Queen")) {
						System.out.println("Queen can be caught");
					} else if (s2.getName().contains("Rook")) {
						System.out.println("Rook can be caught");
					} else if (s2.getName().contains("Bishop")) {
						System.out.println("Bishop can be caught");
					} else if (s2.getName().contains("Knight")) {
						System.out.println("Knight can be caught");
					} else if (s2.getName().contains("Pawn")) {
						System.out.println("Pawn can be caught");
					}
				}
			}
		}

		int moveID = rand.nextInt(possibilities.size());
		System.out.println("Agent randomly selected move : " + moveID);
		for (int i = 1; i < (possibilities.size() - (moveID)); i++) {
			possibilities.pop();
		}
		Move selectedMove = (Move) possibilities.pop();
		return selectedMove;
	}

	public Move twoLevelsDeep(Stack possibilities) {
		Move selectedMove = new Move();
		return selectedMove;
	}

}
