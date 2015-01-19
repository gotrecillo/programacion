
public class TestFraccion {

	public static void main(String[] args) {
		Fraccion medio = new Fraccion(1,2);
		Fraccion unMedio = new Fraccion(1,2);
		Fraccion dosCuartos = new Fraccion(2,4);
		Fraccion sexto = new Fraccion(1,6);
		Fraccion suma = medio.suma(sexto);
		System.out.println(medio);
		System.out.println(unMedio);
		System.out.println(suma);
		if ( medio.equals(unMedio)){
			System.out.println("Son iguales");
		}
		if ( medio.equivalente(dosCuartos)){
			System.out.println("Son euivalentes");
		}
		String maligno = "Soy malo";
		String malvado = "Soy malo";
		if (maligno == malvado){
			System.out.println("Somos los gemelos malvados");
		}
	}	
}
