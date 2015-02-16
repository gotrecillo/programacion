/*
 5. Diseñar la clase Fecha con sus constructores, métodos set y get , toString, equals() validarFecha()  

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
	
	public boolean validar(){
		boolean respuesta = true;
		if ((this.mes < 1)||(this.mes > 12)){
			respuesta = false;
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
							respuesta = false;
						}else{
							respuesta = true;
						}
						break;
			
			case 2: 	if (this.año % 4 == 0){
							if ((this.dia < 1) || (this.dia > 29)){
								respuesta = false;
							}else{
								respuesta = true;
							}	
						}else{
							if ((this.dia < 1) || (this.dia > 28)){
								respuesta = false;
							}else{
								respuesta = true;
							}
						}
						break;
			case 4:
			case 6:
			case 9:
			case 11:
						if (this.dia < 1 || this.dia > 30){
							respuesta = false;
						}else{
							respuesta = true;
						}
						break;
			}
		}
		return respuesta;
	}

}
