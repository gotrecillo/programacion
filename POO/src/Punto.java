/*
 7. Diseñar la clase Punto que represente un punto en el espacio de dos dimensiones. 
 Se definirá Punto() (en el origen x=0, y=0), Punto(x,y), métodos set ..() y get..() , 
 toString(), distanciaAlOrigen(), distanciaOtroPunto(), toString(), equals()
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
	
	public double distanciaAlOrigen(){
		Punto o = new Punto(0,0);
		double distancia = this.distanciaOtroPunto(o);
		return distancia;
	}
	
	public double distanciaOtroPunto(Punto punto){
		try{
		double horizontal = this.x - punto.x;
		double vertical = this.y - punto.y;
		double distancia = Math.sqrt(horizontal*horizontal + vertical*vertical);
		return distancia;
		}catch (Exception e){
			System.out.println("Ha habido un error");
			return -1;
		}
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
