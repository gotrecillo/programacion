/*
 1. Modificar el método double distanciaOtroPunto(Punto p); de la clase Punto para que lance una excepción 
 si el punto que se le pasa es null. La excepción deberá contener un mensaje descriptivo del problema.
a. Lanzando una excepción de la clase Exception
b. Creando una clase MiExcepcionPunteroNulo.
c. Escribir un programa desde el que calcule la distancia entre dos puntos.
 */

public class Punto {
	private double x;
	private double y;
	
	public Punto(){		
	}
	
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distanciaAlOrigen() throws MiExcepcionPunteroNulo{
		Punto o = new Punto(0,0);
		double distancia = this.distanciaOtroPunto(o);
		return distancia;
	}
	
	public double distanciaOtroPunto(Punto punto) throws MiExcepcionPunteroNulo{
		if (punto == null) {
			throw new MiExcepcionPunteroNulo();
		}
		double horizontal = this.x - punto.x;
		double vertical = this.y - punto.y;
		double distancia = Math.sqrt(horizontal*horizontal + vertical*vertical);
		return distancia;
		
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean equals(Object punto){
		 if (punto instanceof Punto) 
		    {
		      Punto punt = (Punto) punto;
		      if ( this.toString().equals(punt.toString()) )
		         return true;
		    }
	    return false;	
	}
	
	public String toString(){
		return "( " + x + " , " + y + " )";
	}
}
