/*
 5. Diseñar un método  que nos indique si dos arrays
   de enteros de tamaño 100 y n elementos son ‘circularmente iguales’, esto significa, 
   tener los mismos elementos y en el mismo orden relativo: circularmente {3,4, 1, 5} = {5, 3, 4, 1}.
 */
public class Ejercicio3_5 {

	public static void main(String[] args) {
		int a[] = {3,4,1,5}, b[] = {5,3,4,1}, c[] = {1,1,4,2,6}, d[] = {1,4,2,6,1};
		boolean ab;
		boolean cd;
		ab = MisArrays.circularmenteIguales(a, b, 4, 4);
		cd = MisArrays.circularmenteIguales(c, d, 5, 5);
		if (ab){
			System.out.println("a y b son circularmente iguales");
		}
		if (cd){
			System.out.println("c y d son circularmente iguales");
		}
	}
}
