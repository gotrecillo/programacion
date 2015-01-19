public class Fraccion {
	
	private int numerador, denominador;
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public boolean equals(Fraccion fraccion){
		boolean resultado;
		if (this.toString().equals(fraccion.toString())){
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	public boolean equivalente(Fraccion fraccion){
		boolean resultado;
		Fraccion simplificadaUno = new Fraccion(this.numerador, this.denominador);
		Fraccion simplificadaDos = new Fraccion(fraccion.numerador, fraccion.denominador);
		simplificadaUno.simplificar();
		simplificadaDos.simplificar();
		if (simplificadaUno.equals(simplificadaUno)){
			resultado = true;
		}else{
			resultado = false;
		}
		return resultado;
	}
	
	public void simplificar(){
		int numerador = this.numerador;
		int denominador = this.denominador;
		if (numerador == denominador){
			this.numerador = 1;
			this.denominador = 1;
		}else if (numerador < denominador){
			for (int i = 2; i <= numerador; ){
				if (Divisor.esDivisorComun(denominador, numerador, i)){
					numerador = numerador / i;
					denominador = denominador / i;
				}else{
					i++;
				}
			}
			this.denominador = denominador;
			this.numerador = numerador;
		}else {
			for (int i = 2; i <= denominador; ){
				if (Divisor.esDivisorComun(denominador, numerador, i)){
					numerador = numerador / i;
					denominador = denominador / i;
				}else{
					i++;
				}
			}
			this.denominador = denominador;
			this.numerador = numerador;
		}
	}
	
	public Fraccion suma(Fraccion fraccion){
		Fraccion resultado;
		int a = this.numerador;
		int b = this.denominador;
		int c = fraccion.numerador;
		int d = fraccion.denominador;
		int e, f;
		e = a * d + c * b;
		f = b * d;
		resultado = new Fraccion (e, f);
		resultado.simplificar();
		return resultado;
	}

	public Fraccion sumaDosFracciones(Fraccion sumandoUno, Fraccion sumandoDos){
		Fraccion resultado = sumandoUno.suma(sumandoDos);
		return resultado;
	}
	
	public String toString(){
		String fraccion;
		fraccion = (this.numerador+ " / "+this.denominador);
		return fraccion;
	}
	
	public void visualizar(){
		System.out.println(this);
	}
	
}

