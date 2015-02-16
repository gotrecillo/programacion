/*
 9. Diseñar la clase MiArray  teniendo como atributos el número de elementos ocupados del array 
 y empleando un array de TAM enteros como espacio de almacenamiento. La interfaz de la clase estará compuesta por los métodos MiArray(),
  insertar(dato, posicion), borrar(dato), ordenar(), buscar(),..., visualizar(), toString().
   Crear una clase PruebaArray en la que se prueban los métodos definidos en Miaría.
 */

public class MiArray {
	private int n = 0;
	private int []a;
	
	public MiArray(){	
	}
	
	public MiArray(int []a, int n){
		this.n = n;
		this.a = a;
	}
	
	public void insertar(int dato, int posicion){
		int i = this.n-1;
		
		while(i >= posicion){
			this.a[i + 1] = this.a[i];
			i--;
		}		
		this.a[posicion] = dato;
		this.n = this.n + 1;	
	}
	
	public void borrar(int dato){
		int posicion;
		
		do{
			posicion = this.busquedaSecuencial(dato);
			if (posicion != -1){
				this.borrarDato(posicion);
			}
		}while(posicion != -1);
	}
	
	public void borrarDato(int posicion){
		for (int i = posicion; i < (this.n-1); i++){
			this.a[i] = this.a[i+1];
		}
		this.a[n-1] = 0;
		this.n = this.n-1;
	}
	
	public int busquedaSecuencial(int dato){
		int posicion = -1;
		
		for (int i = 0;((posicion == -1)&&(i < this.n)); i++){
			if (this.a[i] == dato){
				posicion = i;
			}
		}
		return posicion;
	}
	
	public boolean equals(Object miArray){
		 if (miArray instanceof MiArray) 
		    {
		      MiArray miA = (MiArray) miArray;
		      if ( this.toString().equals(miA.toString()) )
		         return true;
		    }
	    return false;		
	}
	
	public void ordenacionSecuencial(){
		int posMenor, posAux, posActual = 0, aux;
		while (posActual < this.n - 1){
			for (posMenor = posActual, posAux = posActual; posAux < this.n; posAux++){
				if (this.a[posAux] < this.a[posMenor]) {
					posMenor = posAux;
				}
			}
			aux = this.a[posActual];
			this.a[posActual] = this.a[posMenor];
			this.a[posMenor] = aux;
			posActual++;
		}
	}
	
	public String toString(){
		String s = "";
		for ( int i = 0; i < this.n; i++ ){
			s = s + this.a[i] + " ";
		}
		return s;
	}
	
	public void visualizar(){
		System.out.println(this.toString());
	}
}
