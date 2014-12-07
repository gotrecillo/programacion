
public class Board {

	private int[][] position;
	private int turn;
	private int ideal;
	private int size;
	
	//Inicializo el tablero de juego
	public Board(int size){
		this.size = size;
		position = new int[size][3];
		turn = 0;
		ideal = (int)Math.pow(2, size) - 1;
		for(int i = 0; i < this.size; i++){
			position[i][0] = size;
			position[i][1] = 0;
			position[i][2] = 0;
			size--;
		}
	}
	
	
	//metodos getter
	public int getTurn(){
		return turn;
	}
	public int getIdeal(){
		return ideal;
	}
	
	//Visualizo el estado del tablero
	public void viewBoard(){
		int size = this.size;
		
		System.out.println("-------------");
		for (int i = size-1; i >= 0; i--){
			System.out.print("| ");
			for (int j = 0; j < 3; j++){
				System.out.print(position[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
			}
		System.out.println("--0---1---2--");
	}
	
	//Obtengo la posicion superior ocupada de una varilla
	public int getTopPosition(int stick){
		int i = size-1;
		boolean found = false;
		int top = 0;
		
		while ((i >= 0)&&(!found)){
			if (position[i][stick] > 0){
				found = true;
				top = i;
			}
			i--;
		}
		return top;
	}
	
	//Obtengo el grosor del disco superior de una varilla
	public int getTopValue(int stick){
		int top = getTopPosition(stick);
		int value = position[top][stick];
		return value;
	}
	
	//Muevo de una varilla a otra si se puede, si no se puede doy un aviso
	public void moveFromTo(int fromStick, int toStick){
		int fromValue = getTopValue(fromStick);
		int toValue = getTopValue(toStick);
		int fromPos = getTopPosition(fromStick);
		int toPos = getTopPosition(toStick);
		
		if ((toValue < fromValue) && (toValue != 0) || (fromValue == 0) || (fromStick == toStick)){
			System.out.println("Movimiento ilegal");
		}else{
			if (toValue == 0){
				position [toPos][toStick] = fromValue;
				position [fromPos][fromStick] = 0;
				turn++;
			}else{
				position [toPos+1][toStick] = fromValue;
				position [fromPos][fromStick] = 0;
				turn++;	
			}
		}
	}
	
	//Condicion ganadora
	public boolean didYouWin(){
		boolean status = true;
		if ((isPositionEmpty(size-1, 1))&&isPositionEmpty(size-1, 2)){
			status = false;
		}
		return status;
	}
	
	//Comprobar si una posicion esta vacia
	public boolean isPositionEmpty(int height, int stick){
		return (position [height][stick] == 0) ? true : false;
	}
	
}
