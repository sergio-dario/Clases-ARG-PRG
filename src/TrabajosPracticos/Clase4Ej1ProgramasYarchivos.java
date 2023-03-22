package TrabajosPracticos;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramasYarchivos {

	public static void main(String[] args) {
		
		// a)Haga un main, donde por parametro ponga 3 numeros y una letra que represente ascendente y los muestre ordenados con tal criterio
		
		int numero1[] = new int [3];
		numero1 [0] = 1;
		numero1 [1] = 37;
		numero1 [2] = 16;
		char ascendente1='A';
		char letra1='A';
		if (ascendente1==letra1) {
			
			Arrays.sort(numero1);
			for (int i=0; i< numero1.length; i++)
			
			
			System.out.println(numero1[i])	;
				
			}else {
				Arrays.sort(numero1);
				for (int i=numero1.length-1; i>=0 ; i--)
				
				
				System.out.println(numero1[i])	;
			}
		
		// b) haga lo mismo, pero solicitando los parametros de a uno por consola	
 
	Scanner DatoNumerico = new Scanner(System.in);
 
     System.out.println("ingrese 3 numeros separados por un espacio") ;

	int numero[] = new int[3];
	numero[0]= DatoNumerico.nextInt();
	numero[1]= DatoNumerico.nextInt();
	numero[2]= DatoNumerico.nextInt();
	
	Scanner orden = new Scanner(System.in);
	System.out.println("ingrese letra A para ordenar ascendentemente o letra D ordenar descendentemente");
	char letra = orden.next().charAt(0);
	
	char ascendente='A';
	
	
	if (ascendente==letra) {
	
	Arrays.sort(numero);
	for (int i=0; i< numero.length; i++)
	
	
	System.out.println(numero[i])	;
		
	}else {
		Arrays.sort(numero);
		for (int i=numero.length-1; i>=0 ; i--)
		
		
		System.out.println(numero[i])	;
	}}}
           





