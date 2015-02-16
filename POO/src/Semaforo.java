/*
 3. Definir una clase que represente un semáforo: Semaforo. En la definición se debe incluir como atributos:
El color del semáforo (VERDE,ROJO, AMBAR)
Los métodos:
Semáforo()
Semafor(color)
verSemaforo()
toString()
cambiarSemáforo()
equals()
 */

public class Semaforo {

	private ColSemaforo color;
	
	public Semaforo(){
		color = ColSemaforo.NADA;
	}
	
	public Semaforo(ColSemaforo color){
		this.color = color;
	}
	
	public void verSemaforo(){
		switch (color){
			
			case NADA: 	System.out.println("( )");
						System.out.println("( )");
						System.out.println("( )");
						break;
			
			case ROJO: 	System.out.println("(O)");
						System.out.println("( )");
						System.out.println("( )");
						break;
			
			case AMBAR: System.out.println("( )");
						System.out.println("(O)");
						System.out.println("( )");
						break;
			
			case VERDE: System.out.println("( )");
						System.out.println("( )");
						System.out.println("(O)");
						break;
			
		}
	}
	
	public String toString(){
		return color.toString();
	}
	
	public void cambiarSemaforo(){
		switch (color){
			
			case ROJO: 	color = ColSemaforo.VERDE;
						break;
						
			case AMBAR: 	color = ColSemaforo.ROJO;
						break;
			
			case VERDE: color = ColSemaforo.AMBAR;
						break;
		}
	}
	
	public boolean equals(Object semaforo){
		 if (semaforo instanceof Semaforo) 
		    {
		      Semaforo semaf = (Semaforo) semaforo;
		      if ( this.color.equals(semaf.color) )
		         return true;
		    }
	    return false;	
	}
}
