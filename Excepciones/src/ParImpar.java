/*
 5. Escribir un programa que genere un número aleatorio e indique si el número generado es par o impar lanzando una excepción
a. De la clase Exception con distintos mensajes.
b. Creando dos clase ParException e ImparException
Nota: Math.random() genera un número aleatorio entre 0 y 1
 */
public class ParImpar {

	public static void main(String[] args) throws Exception, ParExcepcion, ImparExcepcion{
		int num = (int) (Math.random()*10);
		System.out.println(num);
		/*if (num%2 == 0){
			Exception par = new Exception("Es Par");
			throw par;
		}else{
			Exception impar = new Exception("Es Impar");
			throw impar;
		}*/
		if (num%2 == 0){
			Exception par = new ParExcepcion();
			throw par;
		}else{
			Exception impar = new ImparExcepcion();
			throw impar;
		}
	}

}
