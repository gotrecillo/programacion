
public class TestOrdenacionInsercionDirecta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[7];
		MisArrays.llenarRandomArray(a, 5);
		//MisArrays.visualizarArray(a, 5);
		//System.out.println("----");
		//MisArrays.ordenacionSecuencial(a, 10);
		MisArrays.visualizarArray(a, 5);
		System.out.println("---");
		MisArrays.ordenacionInsercionDirecta(a, 5);
		MisArrays.visualizarArray(a, 5);
		//System.out.println("----");
		//MisArrays.ordenacionBurbuja(a, 10);
		//MisArrays.visualizarArray(a, 10);
	}

}
