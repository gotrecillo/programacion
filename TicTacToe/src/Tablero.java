
public class Tablero {

	private char[][] tablero;
	private char marcaJugador;
	
	public Tablero(){
		tablero = new char[3][3];
		marcaJugador = 'O';
		iniciarTablero();
	}
	
	//Iniciamos con el tablero en blanco
	public void iniciarTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j]='-';
			}
		}
	}
	
	//Dibujamos el tablero
	public void pintaTablero() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++){
			System.out.print("| ");
			for (int j = 0; j < 3; j++){
				System.out.print(tablero[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	//Comprobamos si esta lleno
	public boolean estaLLeno(){
		boolean lleno = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j]=='-'){
					lleno = false;
				}
			}
		}
		return lleno;
	}
	
	
}
