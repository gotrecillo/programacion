
public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(21,1,1987);
		Fecha fecha2 = new Fecha(29,2,1987);
		Fecha fecha3 = new Fecha(29,2,2000);
		Fecha fecha4 = new Fecha(21,111,1987);
		Fecha fecha5 = new Fecha(0,1,1987);
		Fecha fecha6 = new Fecha(21,1,-1987);
		
		if (fecha1.validar()){
			System.out.println("La fecha "+fecha1.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha1.toString()+ " no es valida");
		}
		
		if (fecha2.validar()){
			System.out.println("La fecha "+fecha2.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha2.toString()+ " no es valida");
		}
		
		if (fecha3.validar()){
			System.out.println("La fecha "+fecha3.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha3.toString()+ " no es valida");
		}
		
		if (fecha4.validar()){
			System.out.println("La fecha "+fecha4.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha4.toString()+ " no es valida");
		}
		
		if (fecha5.validar()){
			System.out.println("La fecha "+fecha5.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha5.toString()+ " no es valida");
		}
		
		if (fecha6.validar()){
			System.out.println("La fecha "+fecha6.toString()+ " es valida");
		}else{
			System.out.println("La fecha "+fecha6.toString()+ " no es valida");
		}

	}

}
