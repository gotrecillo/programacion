/*
 8. Diseñar la clase Ruta teniendo en cuenta que una ruta es un conjunto de puntos. 
 Diseñar este conjunto de puntos como un array. Diseñar los métodos Ruta(), Ruta(Punto [] p), 
 métodos se..()t y get…(), toString(), equals(), trayectoria() (la suma de las distancias entre los puntos de la ruta. 
 Crear una clase PruebaRuta en la que se cree una ruta y se prueben todos los métodos.
 */

public class Ruta {
	private Punto[] ruta;
	
	public Ruta(){
		ruta = new Punto[25];
		for (int i = 0; i < ruta.length; i++){
			ruta[i] = new Punto(0,0);
		}
	}
	
	public Ruta(Punto [] ruta){
		this.ruta = ruta;
	}
	
	public Punto[] getRuta(){
		return ruta;
	}
	
	public int getLength(){
		return ruta.length;
	}
	
	public void setRuta(Punto[] ruta){
		this.ruta = ruta;
	}
	
	public double trayectoria(){
		double trayectoria = 0;
		try {
			for (int i = 0; i < ruta.length -1 ; i++){
				trayectoria = trayectoria + ruta[i].distanciaOtroPunto(ruta[i+1]);
			}
		} catch (Exception e) {
			System.out.println("Punto nulo");
		}
		
		return trayectoria;
	}
	
}
