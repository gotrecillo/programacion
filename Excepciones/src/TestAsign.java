
public class TestAsign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Asignatura una = new Asignatura(Ciclo.ASI, NombreAsignatura.FOL, true);
		Asignatura dos = new Asignatura(Ciclo.DAI, NombreAsignatura.FP, true);
		una.imprimirAsignatura();
		dos.imprimirAsignatura();
	}

}
