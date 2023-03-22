package TrabajosPracticos;



import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		//a) Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String

				String variableString = "Dado un String y una letra";
				char unaLetra = 'a';
				int cantVecesDeAparicion = 0;
				
				char letraDelString;
				
				for(int i = 0 ;  i < variableString.length() ; i++) {
					letraDelString = variableString.charAt(i);
					if(letraDelString == unaLetra) {
						cantVecesDeAparicion++;
					}		
				}
				
				System.out.println("1 a) Cantidad de apariciones de la letra \""+unaLetra+"\":"+cantVecesDeAparicion);
				
		//b) Dado 3 numeros y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3"
				
				System.out.println("b) Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3");
				
				
				Integer numeros[] = {-2,23,0};
				boolean ascendente = true;
				
				if(ascendente) {
					//Ordenamos de menor a mayor
					Arrays.sort(numeros);
				}else {
					//Ordenamos de mayor a menor
					Arrays.sort(numeros, Collections.reverseOrder());
				}
				
				for(int elemento : numeros) {
					System.out.println(elemento);
					
				}
				
				
				System.out.println("c) dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado");
				
				int vectorNumeros[] = {10,20,30};
				int sumatoriaDeNumeros = 0;
				int x = 0;
				for(int num : vectorNumeros) {
					if(num >= x) {
						sumatoriaDeNumeros = sumatoriaDeNumeros + num;
					}	
					}
					System.out.println(sumatoriaDeNumeros);				
				
				
			

		// Genere una clase que tenga los metodos para realizar la codificacion y decodificacion de un string, dado un  desplazamiento.

					System.out.println("2 A)Genere una clase que tenga los metodos para realizar la codificacion y decodificacion de un string, dado un desplazamiento");
					
				    String hola = "hola que tal";
		             byte[] decodedBytes = hola.getBytes(); 
		 
		            	 for(int j=0; j<decodedBytes.length; j++) {
		            		 decodedBytes[j]= (byte)(decodedBytes[j] + 1);
		            	 }
		            
		            		 hola = new String (decodedBytes);
		            		 System.out.println(hola);
		            		 
	}
	{// Genere una clase que tenga los metodos para realizar la codificacion y decodificacion de un string, dado un numero de desplazamiento.

		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Ingresa una frase");
			
			String frase = scn.nextLine();
			
			System.out.println("Ingresa el desplazamiento deseado");
			
			int desplazamiento = scn.nextInt();
			
			//Encode: transformar el String en el código numérico
			byte[] decodedBytes = frase.getBytes();
			
			for(int j = 0; j < decodedBytes.length ; j++) {
				decodedBytes[j] = (byte) (decodedBytes[j] + desplazamiento);
			}
			
			
			//Decode: recuperar el String a partir del array de bytes
			frase = new String(decodedBytes);
			
			System.out.println(frase);
		}

	}}
				            		 
				            		
				            		
				            		 
		           	 
					
				