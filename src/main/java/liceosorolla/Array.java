package main.java.liceosorolla;

import java.util.Arrays;

public class Array {
	
	public static int calculaMximo( int[] letras)  throws Exception {
		int maximo=0;
		for(int i =0;i<=letras.length-1;i++) {
			if(i==0) {
				maximo= letras[i];
			}else if(maximo<letras[i]){
				maximo= letras[i];
			}
		}
		
		return maximo;
	}
	public static double mediana(int[]array) {
		double mediana=0;
		Arrays.sort(array);
		int mitad=array.length/2;
		if(array.length%2!=0) {
			mediana=array[mitad];
		}else {
			mediana=(double)(array[mitad-1]+array[mitad])/2;
		}
		return mediana;
	}
	
	public static void main(String[] args) throws Exception {
		int maximo=0;
		int[] letras = { 25, 1, 3, 8, 6, 19, 50, 9};
		
		maximo = calculaMximo(letras);
		System.out.println("El numero mas alto es "+maximo);
		double mediana=mediana(letras);
		System.out.println("La mediana es "+mediana);
		int minimo=minimo(letras);
		System.out.println("El mínimo sera: "+minimo);
		
	}
	public static int minimo(int[]array) {
		int min=0;
		 
		min=array[0];
 
		for(int i = 1; i < array.length; i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			}
		return min;
	}
}


