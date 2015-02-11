
public class PruebaSemaforo {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo(ColSemaforo.ROJO);
		for (int i = 0; i < 4; i++){
			semaforo.verSemaforo();
			System.out.println();
			semaforo.cambiarSemaforo();
		}
	}

}
