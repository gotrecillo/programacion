
public class TestRuta {

	public static void main(String[] args) {
		double x, y;
		double trayectoria;
		Punto [] ruta = new Punto[20];
		for(int i = 0; i < ruta.length; i++){
			x = Math.random()*10;
			y = Math.random()*10;
			ruta[i] = new Punto(x,y);
			System.out.println(ruta[i].toString());
		}
		Ruta locura = new Ruta(ruta);
		trayectoria = locura.trayectoria();
		System.out.println(trayectoria);
	}

}
