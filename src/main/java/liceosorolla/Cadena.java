package main.java.liceosorolla;

public class Cadena {

	public static void main(java.lang.String[] args) {
		String cadena="Hola soy perico ";
		mayusminus(cadena);
	}
public static void mayusminus(String cadena) {
	System.out.println("La frase en minusculas será: "+cadena.toLowerCase()); 
    System.out.println("La frase en mayusculas será: "+cadena.toUpperCase()); 
}
}