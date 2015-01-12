import java.util.Scanner;
public class MisArrays {
	
	public static int contarDato(int []a, int n, int dato){
		int repeticiones = 0;
		for (int i = 0; i < n; i++){
			if (a[i] == dato){
				repeticiones++;
			}
		}
		return repeticiones;
	}
	
	public static int insertarDato(int []a, int n, int posicion, int dato){
		int i = n-1;
		
		while(i >= posicion){
			a[i + 1] = a[i];
			i--;
		}		
		a[posicion] = dato;
		n++;	
		return n;	
	}
	
	public static void visualizarArray(int []a, int n){
		int i = 0;
		
		while(i < n){
			System.out.println(a[i]);
			i++;
		}			
	}
	
	public static void visualizarArray(int [][]a, int n){
		for (int i = 0; i < n; i++){
			System.out.print(a[i][0]);
			System.out.print(a[i][1]);
			System.out.println();
		}
	}
	
	public static boolean esIgualArray(int []a, int []b, int n, int m){
		boolean respuesta = false;
		
		if (n == m){
			respuesta = true;
		}
		for(int i = 0; (i < n) && (respuesta);i++){
			if (a[i] != b[i]){
				respuesta = false;
			}
		}
		return respuesta;
	}
	
	public static int sumaArray(int []a, int n){
		int suma = 0;
		for (int i = 0; i < n; i++){
			suma = suma + a[i];
		}
		return suma;
	}
	
	public static int[] multiplicacionArray(int a[], int b[], int n){
		int c[] = new int[a.length];
		
		for(int i = 0; i < n; i++){
			c[i] = a[i] * b[i];
		}
		return c;
	}
	
	public static double mediaArray(int []a, int n){
		int suma = 0;
		double media = 0;
		
		for (int i = 0; i < n; i++){
			suma = suma + a[i];
		}
		if (n != 0){
			media = (double)suma / n;
		}
		return media;
	}
	
	public static void llenarArray(int []a, int n){
		int i = 0;
		Scanner teclado = new Scanner (System.in);
		
		while(i < n){
			System.out.println("Introduce un valor para la posición: "+i);	
			a[i] = teclado.nextInt();
			i++;
		}	
	}
	
	public static void llenarArray(int [][]a, int n){
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < n; i++){
			System.out.println("Introduce un valor para la celda de la fila: "+i+" de la primera columna");
			a[i][0] = teclado.nextInt();
			System.out.println("Introduce un valor para la celda de la fila: "+i+" de la segunda columna");
			a[i][1] = teclado.nextInt();
		}
	}
	
	public static void llenarRandomArray(int []a, int n){
		for (int i = 0; i < n; i++){
			a[i] = (int)(Math.random()*101);
		}
	}
	
	public static void pintaAsteriscos(int a[], int n){
		for (int i = 0; i < n; i++){
			for (int j = 0; j < a[i]; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void pintaCuadrado(int filas, int columnas){
		char [][]c = new char[filas][columnas];
		
		llenarDeAsteriscos(c, filas, columnas);
		pintaArray(c, filas, columnas);
	}
	
	public static void llenarDeAsteriscos(char [][]c, int filas, int columnas){
		for (int i = 0; i < filas; i++ ){
			for (int j = 0; j < columnas;j++){
				c[i][j] = '*';
			}
		}
	}
	
	public static void pintaArray(char [][]c, int filas, int columnas){
		for (int i = 0; i < filas; i++ ){
			for (int j = 0; j < columnas;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int borrar(int []a, int n, int dato){
		int posicion;
		
		do{
			posicion = busquedaSecuencial(a, n, dato);
			if (posicion != -1){
				n = borrarDato(a, n, posicion);
			}
		}while(posicion != -1);
		return n;
	}
	
	public static int borrarDato(int []a, int n, int posicion){
		for (int i = posicion; i < (n-1); i++){
			a[i] = a[i+1];
		}
		a[n-1] = 0;
		return n-1;
	}
	
	public static int[] buscar(int a[], int n, int dato){
		int repeticiones = 0;
		int posiciones[];
		
		for (int i = 0; i < n; i++){
			if (a[i] == dato){
				repeticiones++;
			}
		}
		posiciones = new int[repeticiones];
		for (int i = 0, j = 0; j < repeticiones; i++){
			if (a[i] == dato){
				posiciones[j] = i;
				j++;
			}
		}
		return posiciones;
	}
	
	public static int busquedaSecuencial (int a[], int n, int dato){
		int posicion = -1;
		
		for (int i = 0;((posicion == -1)&&(i < n)); i++){
			if (a[i] == dato){
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static int busquedaCentinela (int a[], int n, int dato){
		int i = 0;
		a[n] = dato;
		
		while (a[i] != dato){
			i++;
		}
		if (i==n){
			return -1;
		}else{
			return i;
		}
	}
	
	public static int busquedaBinaria (int a[], int n, int dato){
		int posicion = -1;
		int inicio = 0;
		int fin = n-1;
		int medio = inicio + fin / 2;
		
		while ((a[medio] != dato)&&(medio != fin)&&(medio != inicio)){
			if (a[medio] < dato){
				inicio = medio+1;
			}else{
				fin = medio-1;
			}
			medio = inicio + fin / 2;
		}
		
		if (a[medio] == dato) {
			posicion = medio;
		}
		return posicion;
	}
	
	public static int busquedaMenor (int a[], int n){
		int posicion = 0;
		int menor = a[posicion];
		
		for (int i = 0; i < n; i++){
			if (a[i] < menor ){
				posicion = i;
				menor = a[posicion];
			}
		}
		return posicion;
	}
	
	public static int busquedaMayor (int a[], int n){
		int posicion = 0;
		int mayor = a[posicion];
		
		for (int i = 0; i < n; i++){
			if (a[i] > mayor){
				posicion = i;
				mayor = a[posicion];
			}
		}
		return posicion;
	}
	
	public static int[] mayorMenor(int a[], int n){
		int [] mayorMenor;
		int size, mayor, menor, indMayor, indMenor;
		
		indMayor = busquedaMayor(a, n);
		mayor = a[indMayor];
		indMenor = busquedaMenor(a,n);
		menor = a[indMenor];
		if (mayor == 0){
			size = 0;
			mayorMenor = new int[size];
		}else if (mayor == menor){
				size = 1;
				mayorMenor = new int[size];
				mayorMenor[0] = mayor;
			}else{
				size = 2;
				mayorMenor = new int[size];
				mayorMenor[0] = menor;
				mayorMenor[1] = mayor;
		}
		return mayorMenor;
	}
	
	public static int borrarMenor (int a[], int n){
		int posicion = busquedaMenor( a, n);
		return borrarDato(a, n, posicion);
	}
	
	public static void ordenacionSecuencial (int []a, int n){
		//TO DO metodo para ordenar secuencialmente un array
	}
	
	public static void ordenacionBurbuja (int []a, int n){
		int cambios, aux;
		
		do{
			cambios = 0;
			for (int i = 1; i < n; i++){
				if (a[i] < a[i-1]){
					aux = a[i];
					a[i] = a[i-1];
					a[i-1] = aux;
					cambios++;
				}
			}
		}while (cambios > 1);	
	}
	
	public static void ordenacionInsercionDirecta (int []a, int n){
		//TO DO metodo de ordenacion por insercion directa
	}
}
