/*
3. Diseñar la clase Fecha con sus constructores, métodos set y get toString, validarFecha() 
 se lanzará una excepción cuando una fecha no sea válida( mes, día y año correctos)
 */

public class Fecha {

	private int dia, mes, año;
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public boolean equals(Object fecha){
		 if (fecha instanceof Fecha) 
		    {
		     Fecha fec = (Fecha) fecha;
		      if ( this.toString().equals(fec.toString()))
		         return true;
		    }
		 return false;
	}
	
	public String toString(){
		return dia+"/"+mes+"/"+año;
	}
	
	public void validar() throws Exception{
		if ((this.mes < 1)||(this.mes > 12)){
			throw new Exception();
		}else{
			switch (this.mes){
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
						if (this.dia < 1 || this.dia > 31){
							throw new Exception();
						}
						break;
			
			case 2: 	if (this.año % 4 == 0){
								if ((this.dia < 1) || (this.dia > 29)){
									throw new Exception();
								}	
							}else{
								if ((this.dia < 1) || (this.dia > 28)){
									throw new Exception();
								}
							}
						break;
						
			case 4:
			case 6:
			case 9:
			case 11:
						if (this.dia < 1 || this.dia > 30){
							throw new Exception();
						}
						break;
			}
		}
	}
}
