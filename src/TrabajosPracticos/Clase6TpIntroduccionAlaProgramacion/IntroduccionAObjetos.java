package Clase6TpIntroduccionAlaProgramacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class IntroduccionAObjetos {

	public static void main(String[] args) {

		DescuentoFijo desc1 = new DescuentoFijo();
		desc1.setValorDescuento(14);
       
		DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
		desc2.setValorDescuento(0.3);
			
		
	
//punto 2 de ejercicio
	
		String archivo1="C:\\Users\\mercu\\eclipse-workspace\\ArgPrograma\\src\\Clase6TpIntroduccionAlaProgramacion\\tablaProductos.txt";
	ArrayList<Item> items = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(archivo1))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(" ");
            int cantidad = Integer.parseInt(partes[0]);
            int precio = Integer.parseInt(partes[1]);
            String producto = partes[2];
            Item item = new Item(cantidad, precio, producto);
            items.add(item);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	Carrito1 carrito1 = new  Carrito1(items);
	
	System.out.println("costo final del carrito "+carrito1.FinalCosto());
	
	
		
	
   
	

	}
	
}
