
public class TestCoche {
	public static void main (String [] args){
		
		Coche defecto = new Coche();
		Coche potente = new Coche("Hyundai Coupe", "9999XXX", "Rojo", "Deporivo", "Todo Riesgo", 2012, true);
		defecto.visualiza();
		System.out.println("----");
		potente.visualiza();
	}
}
