/*
18. Realizar un módulo (función/procedimiento) que nos permita obtener una 
dirección IP en hexadecimal. El módulo recibe los cuatro octetos de la dirección IP en el array int 
IP[4].
1. Diseñar un múdulo (función/procedimiento) hexadecimal() que transforme un número 
decimal comprendido entre 0 y 255 en dos caracteres hexadecimales char hexa[2].
2. Aplicar esta función en la obtención de la dirección IPHex[8], que contiene un dígito 
hexadecimal en cada elemento.
3. Diseñar el módulo main() desde el que se creen los arrays y las llamadas a las funciones/
procedimientos necesarios para resolver una determinada IP.
4. Ejemplo: 172.16.1.35*/

import java.util.Scanner;
public class Ejercicio18 {
	
	public static void main (String []args){
		int ip[] = new int[4];
		char ipHex[];
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el primer octeto de la direccion IP");
		ip[0] = teclado.nextInt();
		System.out.println("Introduce el segundo octeto de la direccion IP");
		ip[1] = teclado.nextInt();
		System.out.println("Introduce el tercer octeto de la direccion IP");
		ip[2] = teclado.nextInt();
		System.out.println("Introduce el cuarto octeto de la direccion IP");
		ip[3] = teclado.nextInt();
		
		ipHex = ipToChar(ip);
		System.out.println();
		System.out.println("La direccion ip en hexadecimal es:");
		System.out.println();
		for (int i = 0; i < 8; i++){
			System.out.print(ipHex[i]);
		}	
	}
	

	public static char[] octetoToHexadecimal(int n){
		char hex[] = new char[2];
		int resto;
		resto = n%16;
		n = n/16;
		hex[1] = hexToChar (resto);
		hex[0] = hexToChar (n);
		return  hex;
	}
	
	public static char hexToChar(int n){
		char c = 'X';
		
		switch (n){
			case 0: c = '0';
				break;
			case 1: c = '1';
				break;
			case 2: c = '2';
				break;
			case 3: c = '3';
				break;
			case 4: c = '4';
				break;
			case 5: c = '5';
				break;
			case 6: c = '6';
				break;
			case 7: c = '7';
				break;
			case 8: c = '8';
				break;
			case 9: c = '9';
				break;
			case 10: c = 'A';
				break;
			case 11: c = 'B';
				break;
			case 12: c = 'C';
				break;
			case 13: c = 'D';
				break;
			case 14: c = 'E';
				break;
			case 15: c = 'F';
				break;
		}
		return c;
	}
	
	public static char[] ipToChar(int n[]){
		char ip[] = new char[8];
		char ipa[] = octetoToHexadecimal(n[0]);
		char ipb[] = octetoToHexadecimal(n[1]);
		char ipc[] = octetoToHexadecimal(n[2]);
		char ipd[] = octetoToHexadecimal(n[3]);
		ip[0] = ipa[0];
		ip[1] = ipa[1];
		ip[2] = ipb[0];
		ip[3] = ipb[1];
		ip[4] = ipc[0];
		ip[5] = ipc[1];
		ip[6] = ipd[0];
		ip[7] = ipd[1];
		return ip;
	}

}
