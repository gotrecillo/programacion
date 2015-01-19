
public class TestFactorizar {
	public static void main (String []args){
		int n = 5;
		int m = 3;
		int g[] = Divisor.factorizar(m);
		int f[] = Divisor.factorizar(n);
		MisArrays.visualizarArray(f, f.length);
		MisArrays.visualizarArray(g, g.length);
		int facNCom[] = Divisor.factoresNoComunes(n, m);
		System.out.println("----");
		MisArrays.visualizarArray(facNCom, facNCom.length);
		System.out.println("-----");
		int facCom[] = Divisor.factoresComunesMaxExp(n, m);
		MisArrays.visualizarArray(facCom, facCom.length);
		System.out.println("----");
		int facc[] = Divisor.factoresComunesYNoComunesMaxExp(n, m);
		MisArrays.visualizarArray(facc, facc.length);
		int mcm = MisMates.minimoComunMultiplo(n, m);
		System.out.println("----");
		System.out.println(mcm);
		int mcd = MisMates.maximoComunDivisor(n, m);
		System.out.println("----");
		System.out.println(mcd);
	}
}
