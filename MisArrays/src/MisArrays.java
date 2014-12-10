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


	
	public static int crearArray(int []a, int n){
		
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
		return n;
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
}
