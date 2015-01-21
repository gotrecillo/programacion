/*
 2. Definir una clase que represente un coche: Coche. En la definición se debe incluir como atributos:
El modelo
El color (AZUL,VERDE,ROJO,...)
Si la pintura es metalizada o no  (bolean)
La matrícula
El tipo de coche (MINI, UTILITARIO, FAMILIAR ó DEPORTIVO)
El año de fabricación
La modalidad de seguro (A_TERCEROS,  A_TODO_RIESGO)

Emplear los  tipos enum:   
 ColorCoche { AZUL, VERDE, ROJO,...}
 TipoDeCoche  {MINI, UTILITARIO, FAMILIAR, DEPORTIVO};
 TipoDeSeguro {A_TERCEROS, A_TODO_RIESGO};

y como métodos:
Coche()
Coche(modelo, color,…..)
Métodos set... y get... para todos los atributos
…
imprimeCoche() que visualiza el valor de todos los atributos de un objeto de tipo Coche.
toString()
equals()
 */


public class Coche {
	private String modelo, matricula, color, tipo, tipoSeguro;
	private int añoFabricacion;
	private boolean metalizada;
	
	public Coche(){
		this.modelo = null;
		this.matricula = null;
		this.color = null;
		this.tipo = null;
		this.tipoSeguro = null;
		this.añoFabricacion = 1900;
		this.metalizada = false;
	}
	
	public Coche(String modelo, String matricula, String color, String tipo,
			String tipoSeguro, int añoFabricacion, boolean metalizada) {
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.tipo = tipo;
		this.tipoSeguro = tipoSeguro;
		this.añoFabricacion = añoFabricacion;
		this.metalizada = metalizada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isMetalizada() {
		return metalizada;
	}

	public void setMetalizada(boolean metalizada) {
		this.metalizada = metalizada;
	}
	
	public boolean equals(Coche coche){
		boolean respuesta = false;
		if (this.toString().equals(coche.toString())){
			respuesta = true;
		}
		return respuesta;
	}
	
	public String toString(){
		String metal = "";
		if (metalizada){
			metal = "metalizado";
		}
		
		String s = "Modelo: " +modelo+ " , matricula: " +matricula+ ", color: " +color+ " " +metal+ " , tipo: " +tipo+ " , seguro: " +tipoSeguro+ " ,año de fabricación: " +añoFabricacion; 
		return s;
	}
	
	public void visualiza(){
		System.out.println(this.toString());
	}
	
}
