/*
 6. Definir una clase que represente una asignatura de un Ciclo Formativo: Asignatura. En la definición se debe incluir como atributos:
Ciclo al que pertenece (DAI, ASI)
Nombre de la asignatura (PLE,ADA,SIMR, EG, CASE, FOL, RET  para DAI y FP,RAL, SIMM, FOL, RET, IMP, SDBD, DF para ASI)
Código (estático)
Curso  (1,2)

Y como métodos:
Asignatura()
Asignatura(ciclo,nombre,curso)
Métodos set ... y get ... para todos los atributos
imprimirAsignatura() que visualizará los valores de todos los atributos de un objeto de la clase.
toString()
equals()
 */

public class Asignatura {
	
	private Ciclo ciclo;
	private NombreAsignatura nombre;
	private static int codigo = 1;
	private int cod;
	private boolean primero;
	
	public Asignatura(){	
	}
	
	public Asignatura(Ciclo ciclo, NombreAsignatura nombre, boolean primero) {
		this.cod = codigo;
		this.ciclo = ciclo;
		this.nombre = nombre;
		this.primero = primero;
		codigo++;
	}
	
	public Ciclo getCiclo() {
		return ciclo;
	}
	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}
	public NombreAsignatura getNombre() {
		return nombre;
	}
	public void setNombre(NombreAsignatura nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return this.cod;
	}
	public void setCodigo() {
		this.cod = codigo;
		codigo++;
	}
	public boolean isPrimero() {
		return primero;
	}
	public void setPrimero(boolean primero) {
		this.primero = primero;
	}
	
	public String toString(){
		String p;
		if (primero) {
			p = "Primero";
		}else{
			p = "Segundo";
		}
		String s = "Ciclo: " + ciclo.toString() + " , asignatura: " + nombre.toString() + " , curso: " + p + " , codigo: " + this.cod;
		return s;
	}
	
	public void imprimirAsignatura(){
		System.out.println(this.toString());
	}
	
	public boolean equals(Object asignatura){
		 if (asignatura instanceof Asignatura) 
		    {
		      Asignatura asig = (Asignatura) asignatura;
		      if ( this.toString().equals(asig.toString()))
		         return true;
		    }
		    return false;
	}
}
