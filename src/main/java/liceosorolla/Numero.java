package main.java.liceosorolla;

public class Numero {

	public static void main(String[] args) {
		int numero=9;
		int factorial=factorial(numero);
		System.out.println("El factorial de "+9+" es "+factorial);
		System.out.println("¿El numero "+numero+" es primo? "+numeroPrimo(numero));
	}
	public static int factorial(int numero) {
		int contador=1;
		int factorial=1;
		while(contador<=numero){
			factorial = factorial*contador;
			contador++;
		}
		return factorial;
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
