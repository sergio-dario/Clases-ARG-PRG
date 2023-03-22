package TrabajosPracticos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramasYarchivos3 {

	
	public static void main(String[] args) {
		
		
		
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
			try (FileWriter escritura = new FileWriter("DatosArgProg3.txt", true)){
				
				
				escritura.write(frase);
				System.out.println("Texto añadido con exito");
			}catch(FileNotFoundException s) {
				System.out.println("El archivo no existe.");
			}catch (IOException e) {
				e.printStackTrace();
			}}}}


