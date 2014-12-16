public class Divisor {
	
	public static int contarDivisores(int n){
		int divisores = 0;
		
		for (int i = 1; i <= n; i++){
			if (esDivisor(n, i)){
				divisores++;
			}
		}
		return divisores;
	}
	
	public static int sumaDivisores(int n){
		int suma=0;
		for(int i=1;i<=n;i++){
			if (esDivisor(n,i)){
				suma=suma+i;
			}
		}
		return suma;
	}
	
	public static boolean sonAmigos(int a,int b){
		int sumaA, sumaB;
		sumaA=sumaDivisores(a)-a;
		sumaB=sumaDivisores(b)-b;
		if ((sumaA==b)&&(sumaB==a)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean esPerfecto(int n){	
		int suma=0;
		boolean res;
		for (int i=1;i<n;i++){
			if (esDivisor(n,i)){
				suma=suma+i;
			}
		}	
		return res=(suma==n)?true:false;
	}
	
	public static boolean esDivisorComun(int divisorA,int divisorB, int divisorComun){
		return(esDivisor(divisorA,divisorComun)&&esDivisor(divisorB,divisorComun));
	}
	
	public static boolean esDivisor(int dividendo, int divisor){
		return (dividendo%divisor==0);
	}
	
	public static boolean esPrimo(int n){
		boolean res=true;
		
		for(int i=2;i<n;i++){
			if(esDivisor(n,i)){
				res=false;
			}
		}
		return res;
	}
	
}
