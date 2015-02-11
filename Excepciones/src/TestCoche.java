
public class TestCoche {
	public static void main (String [] args){
		
		Color rojo = Color.ROJO;
		TipoCoche deportivo = TipoCoche.DEPORTIVO;
		TipoSeguro seguro = TipoSeguro.A_TODO_RIESGO;
		Coche defecto = new Coche();
		Coche potente = new Coche("Hyundai Coupe", "9999XXX", rojo, deportivo, seguro, 2012, true);
		String p = potente.toString();
		defecto.visualiza();
		System.out.println("----");
		potente.visualiza();
		System.out.println("----");
	}
}
