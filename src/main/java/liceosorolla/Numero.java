package main.java.liceosorolla;

public class Numero {

	public static void main(String[] args) {
		int numero=9;
		System.out.println("¿El numero "+numero+" es primo? "+numeroPrimo(numero));
	}
	
	public static boolean numeroPrimo(int numero) {
		int primo=0;
		boolean bool=false;
		for(int i=1;i<numero;i++) {
			if(numero%i==0) {
				primo++;
			}
		}
		if(primo>1) {
			bool=false;
		}else {
			bool=true;
		}
		return bool;
	}
}
