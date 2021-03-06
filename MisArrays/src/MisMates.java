public class MisMates {
	
	public static int minimoComunMultiplo(int a, int b){
		int factores[] = Divisor.factoresComunesYNoComunesMaxExp(a, b);
		int mcm = MisArrays.productoArray(factores, factores.length);
		return mcm;	
	}
	
	public static int maximoComunDivisor(int a, int b){
		boolean encontrado = false;
		int menor;
		if (a < b){
			menor = a;
		}else{
			menor = b;
		}
		while (!encontrado){
			if (Divisor.esDivisorComun(a, b, menor)){
				encontrado = true;
			}else{
				menor--;
			}
		}
		return menor;
	}
	
	public static boolean esCapicua(int n){
		int digitos = contarDigitos(n);
		int inicio = 0, fin = digitos - 1;
		String convertido = String.valueOf(n);
		boolean respuesta = true;
		while ((inicio < fin) && respuesta){
			if (convertido.charAt(inicio) != convertido.charAt(fin)){
				respuesta = false;
			}
			inicio++;
			fin--;
		}
		return respuesta;
	}
	
	public static int determinante(int[][] matriz){
		int determinante;
		determinante = matriz[0][0]*matriz[1][1]*matriz[2][2]+matriz[0][1]*matriz[1][2]*matriz[2][0]+matriz[0][2]*matriz[1][0]*matriz[2][1]-matriz[0][0]*matriz[1][2]*matriz[2][1]-matriz[0][1]*matriz[1][0]*matriz[2][2]-matriz[0][2]*matriz[1][1]*matriz[2][0];
		return determinante;
	}
	
	public static int potencia(int base, int exponente){
		int pot=1;
		while (exponente>0){
			pot=pot*base;
			exponente--;
		}
		return pot;
	}
	
	public static double fraccionInversa(int n){
		return 1.0/n;
	}
	
	public static void verTabla(int n){
		System.out.println();
		System.out.println("La tabla del "+n);
		System.out.println();
		for(int i=0;i<11;i++){
			System.out.println(i+" * "+n+" = "+ (i*n));
		}
		System.out.println();
	}
	
	public static int factorial(int n){
		int f=1;
		
		while(n>0){
			f=f*n;
			n--;
		}
		return f;
	}
	
	public static double areaCirculo(double radio){
		return Math.PI*radio*radio;
	}
	
	public static double areaCoronaCircular(double radioG, double radioP ){
		double area;
		area=areaCirculo(radioG)-areaCirculo(radioP);
		return area >= 0 ? area: -area;
	}
	
	public static int sumaDigitos(int numero){
		int suma = 0;
		
		while (numero > 0){
			suma = suma + (numero % 10);
			numero = numero / 10;
		}
		return suma;
	}
	
	public static int contarDigitos(int numero){
		int digitos = 0;
		
		while (numero > 0){
			digitos++;
			numero = numero / 10;
		}
		return digitos;
	}
}

