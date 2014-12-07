import java.util.Scanner;
public class GameTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		Board board;
		int turn, size, from, to;
		
		System.out.println("Con cuantos discos quieres jugar");
		size = teclado.nextInt();
		
		while ((size > 9) || (size < 1)){
			System.out.println("Introduce un numero entre 1 y 9");
			size = teclado.nextInt();
		}
		
		board = new Board(size);
		
		while(!board.didYouWin()){
			System.out.println("El tablero de juego esta asi");
			board.viewBoard();
			turn = board.getTurn();
			System.out.println();
			System.out.println("Estas en el turno: "+turn);
			System.out.println();
			System.out.println("�De que varilla quieres mover un disco?");
			from = teclado.nextInt();
			while ((from > 2) || (from < 0)){
				System.out.println("Las varillas estan numeradas del 0 al 2");
				System.out.println("�De que varilla quieres mover un disco?");
				from = teclado.nextInt();
			}
			System.out.println("�A que varilla quieres mover un disco?");
			to = teclado.nextInt();
			while ((to > 2) || (to < 0)){
				System.out.println("Las varillas estan numeradas del 0 al 2");
				System.out.println("�A que varilla quieres mover un disco?");
				to = teclado.nextInt();
			}
			board.moveFromTo(from, to);
		}
		
		System.out.println("Has utilizado "+board.getTurn()+" movimientos");
		System.out.println();
		System.out.println("El tablero de juego ha quedado asi :");
		board.viewBoard();
		if(board.getIdeal()==board.getTurn()){
			System.out.println("Felicidades lo has resuelto en el n�mero m�nimo de movimientos");
		}else{
			System.out.println("Puedes esforzarte mas. Has realizado "+(board.getTurn()-board.getIdeal()+" movimientos extras respecto a la partida perfecta"));
		}
		
		
	}

}
