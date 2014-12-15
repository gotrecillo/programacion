import java.util.Scanner;
public class MisArrays {
	
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
	
	public static int visualizarArray(int []a, int n){
		
		int i = 0;
		
		while(i < n){
			System.out.println(a[i]);
			i++;
		}			
		return n;		
	}


	
	public static int llenarArray(int []a, int n){
		
		int i = 0;
				
		while(i < n){
			System.out.println("Introduce un valor para la posici�n: "+i);
			Scanner teclado = new Scanner (System.in);
			a[i] = teclado.nextInt();
			i++;
		}	
		return n;		
	}

	public static int borrarDato(int []a, int n, int posicion){
		for (int i = posicion; i < (n-1); i++){
			a [i] = a[i+1];
		}
		return n-1;
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
	
	public static int borrarMenor (int a[], int n){
		int posicion = busquedaMenor( a, n);
		return borrarDato(a, n, posicion);
	}
	
	public static void ordenacionSecuencial (int []a, int n){
		//TO DO metodo para ordenar secuencialmente un array
	}
	
	public static void ordenacionBurbuja (int []a, int n){
		//TO DO metodo de ordenacon de la burbuja
	}
	
	public static void ordenacionInsercionDirecta (int []a, int n){
		//TO DO metodo de ordenacion por insercion directa
	}
}
