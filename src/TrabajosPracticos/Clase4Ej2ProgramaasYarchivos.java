package TrabajosPracticos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class ProgramaasYarchivos2 {

	public static void main(String[] args) 
	{
		String archivo="DatosArgProg.txt";
		
		try {
			for(String numeros : Files.readAllLines(Paths.get(archivo))) {
			
				Scanner orden = new Scanner(System.in);
				System.out.println("ingrese letra S para Sumar o letra M para multiplicar");
				char letra = orden.next().charAt(0);
				
				char suma='S';
				int resultado=0;
				int resultado2=1;
				
	for ( String numerostr : numeros.split(" ")){
		
			int numero = Integer.parseInt(numerostr);	
			resultado = resultado + numero;
			resultado2 = resultado2 * numero;
		}
		if (suma==letra) {
		System.out.println("La sumatoria es:"+resultado);}else {	
		System.out.println("La multiplicacion es:"+resultado2);
	}}
	System.out.println();
				
			
		}catch(FileNotFoundException s) {
			System.out.println("El archivo no existe.");
		}catch (IOException e) {
			e.printStackTrace();
		}}}
	
		
	


