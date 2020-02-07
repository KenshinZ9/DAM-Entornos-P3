package main.java.liceosorolla;

public class Cadena {

	public static void main(java.lang.String[] args) {
		String cadena="Hola soy perico ";
		longitud(cadena);
		mayusminus(cadena);
	}

	public static void longitud(String cadena) {
	 	int length = cadena.length();       
        System.out.println("Longitud de una cadena es: " + length+" caracteres"); 
	}
	
	public static void mayusminus(String cadena) {
		System.out.println("La frase en minusculas será: "+cadena.toLowerCase()); 
		System.out.println("La frase en mayusculas será: "+cadena.toUpperCase()); 

	}
}