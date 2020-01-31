package main.java.liceosorolla;

public class Numero {

	public static void main(String[] args) {
		int numero=9;
		int factorial=factorial(numero);
		System.out.println("El factorial de "+9+" es "+factorial);
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

}
