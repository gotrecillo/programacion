
public class Board {

	private int[][] position;
	private int turn;
	private int size;
	
	//Inicializo el tablero de juego
	public Board(int size){
		this.size = size;
		position = new int[size][3];
		
		for(int i = 0; i < this.size; i++){
			position[i][0]=size;
			position[i][1]=0;
			position[i][2]=0;
			size--;
		}
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
	}
	
	//Obtengo la posicion superior ocupada de una varilla
	public int getTopPosition(int stick){
		int i = size-1;
		boolean found = false;
		int top = size-1;
		
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
		
		if (toValue<fromValue){
			System.out.println("El movimiento intentado es ilegal");
		}else{
			position[toPos+1][toStick] = fromValue;
			position[fromPos][fromStick] = 0;
			turn++;
		}
	}
	
	
	public boolean isPositionEmpty(int height, int stick){
		return (position [height][stick] == 0) ? true : false;
	}
	
}
