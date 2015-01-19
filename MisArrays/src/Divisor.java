public class Divisor {
	
	public static int[] factorizar(int n){
		int cantidad = 1;
		int aux = n;
		int i = 2;
		int j = 0;
		while (!esPrimo(aux)){
			if (esDivisor(aux, i)){
				aux = aux / i;
				cantidad++;
			}else{
					i++;
			}
		}
		int f[] = new int[cantidad];
		i = 2;
		while (!esPrimo(n)){
			if (esDivisor(n, i)){
				f[j] = i;
				j++;
				n = n / i;
			}else{
					i++;
			}
		}
		f[j] = n;
		return f;
	}
	
	public static int[] factoresNoComunes(int n, int m){
		int fn[] = factorizar(n);
		int fm[] = factorizar(m);
		int noComunes = 0;
		int nC[];
		int nCIndex = 0;
		for (int i = 0; i < fn.length; i++){
			if (MisArrays.busquedaSecuencial(fm, fm.length, fn[i]) == -1){
				noComunes++;
			}
		}
		for (int i = 0; i < fm.length; i++){
			if (MisArrays.busquedaSecuencial(fn, fn.length, fm[i]) == -1){
				noComunes++;
			}
		}
		nC = new int[noComunes];
		for (int i = 0; i < fn.length; i++){
			if (MisArrays.busquedaSecuencial(fm, fm.length, fn[i]) == -1){
				nC[nCIndex] = fn[i];
				nCIndex++;
			}
		}
		for (int i = 0; i < fm.length; i++){
			if (MisArrays.busquedaSecuencial(fn, fn.length, fm[i]) == -1){
				nC[nCIndex] = fm[i];
				nCIndex++;
			}
		}
		MisArrays.ordenacionBurbuja(nC,nC.length);
		return nC;
	}
	public static int[] factoresComunesMaxExp(int n, int m){
		int fn[] = factorizar(n);
		int fm[] = factorizar(m);
		int cN, cM;
		int comunes = 0;
		int c[];
		int cIndex = 0;
		for (int i = 0; i < fn.length; ){
			if (MisArrays.busquedaSecuencial(fm, fm.length, fn[i]) != -1){
				cN = MisArrays.contarDato(fn, fn.length, fn[i]);
				cM = MisArrays.contarDato(fm, fm.length, fn[i]);
				if (cN > cM){
					comunes = comunes + cN;
				}else{
					comunes = comunes + cM;
				}
				i = i + cN;
			}else{
				i++;
			}
		}
		c = new int[comunes];
		for (int i = 0; i < fn.length; ){
			if (MisArrays.busquedaSecuencial(fm, fm.length, fn[i]) != -1){
				cN = MisArrays.contarDato(fn, fn.length, fn[i]);
				cM = MisArrays.contarDato(fm, fm.length, fn[i]);
				if (cN > cM){
					for (int j = 0; j < cN; j++){
						c[cIndex + j] = fn[i];
					}
					cIndex = cIndex + cN;
				}else{
					for (int j = 0; j < cM; j++){
						c[cIndex + j] = fn[i];
					}
					cIndex = cIndex + cM;
				}
				i = i + cN;
			}else{
				i++;
			}
		}
		MisArrays.ordenacionBurbuja(c, c.length);
		return c;
	}
	
	public static int[] factoresComunesYNoComunesMaxExp(int n, int m){
		int factores, indice = 0;
		int fc[] = factoresComunesMaxExp(n, m);
		int fnc[] = factoresNoComunes(n,m);
		factores = fc.length + fnc.length;
		int fcync[] = new int[factores];
		for (int i = 0; i < fc.length; i++){
			fcync[indice] = fc[i];
			indice++;
		}
		for (int i = 0; i < fnc.length; i++){
			fcync[indice] = fnc[i];
			indice++;
		}
		MisArrays.ordenacionBurbuja(fcync, fcync.length);
		return fcync;
	}
	
	
	public static int contarDivisores(int n){
		int divisores = 0;
		for (int i = 1; i <= n; i++){
			if (esDivisor(n, i)){
				divisores++;
			}
		}
		return divisores;
	}
	
	public static int contarDivisoresPrimos(int n){
		int divisores = 0;
		for (int i = 2; i<=n; i++){
			if ((esDivisor(n, i))&&esPrimo(i)){
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
