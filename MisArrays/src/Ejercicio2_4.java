/*
 . Hacer un programa que dados dos arrays determine si son iguales. Probarlo 
con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2]
 */

public class Ejercicio2_4 {
	
	public static void main(String[] args) {
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [5];
		int d[] = new int [5];
		int e[] = new int [5];
		int f[] = new int [5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		c[3] = 4;
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		e[0] = 1;
		e[1] = 2;
		e[2] = 3;
		f[0] = 1;
		f[1] = 2;
		f[2] = 2;
		
		int n = 3, m = 3, o = 4, p = 3, q = 3, r = 3;
		boolean resA, resB, resC;
		
		resA = MisArrays.esIgualArray(a, b, n, m);
		if (resA){
			System.out.println("La primera pareja son dos arrays iguales");
		}else{
			System.out.println("La primera pareja no son dos arrays iguales");
		}
		
		resB = MisArrays.esIgualArray(c, d, o, p);
		if (resB){
			System.out.println("La segunda pareja son dos arrays iguales");
		}else{
			System.out.println("La segunda pareja no son dos arrays iguales");
		}
		
		resC = MisArrays.esIgualArray(e, f, q, r);
		if (resC){
			System.out.println("La tercera pareja son dos arrays iguales");
		}else{
			System.out.println("La tercera pareja no son dos arrays iguales");
		}
		

	}

}
