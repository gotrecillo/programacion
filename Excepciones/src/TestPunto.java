
public class TestPunto {

	public static void main(String[] args) {
		Punto p = new Punto(2,3);
		Punto q = null;
		try{
			System.out.println("caca");
			System.out.println(p.distanciaOtroPunto(q));
			System.out.println("de la vaca");
		}catch (MiExcepcionPunteroNulo e) {
			System.out.println("Punto q es nulo");
		}
		
	}

}
