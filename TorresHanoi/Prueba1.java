
public class Prueba1 {

	public static void main(String[] args) {
		Board board = new Board(4);
		board.viewBoard();
		int topo = board.getTopPosition(1);
		int top = board.getTopValue(1);
		System.out.println(top);
		System.out.println(topo);
		board.moveFromTo(0, 1);
		board.viewBoard();
	}

}
