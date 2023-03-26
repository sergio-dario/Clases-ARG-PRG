package org.agr.prog.Super;


import org.arg.prog.Super.models.DescuentoPorcentajeConTope;
import org.arg.prog.Super.exceptions.SinStockException;
import org.arg.prog.Super.models.Carrito;
import org.arg.prog.Super.models.DescuentoFijo;
import org.arg.prog.Super.models.DescuentoPorcentaje;
import org.arg.prog.Super.models.ItemCarrito;
import org.arg.prog.Super.models.Persona;
import org.arg.prog.Super.models.Producto;

public class App {

    public static void main( String[] args )
    {
        
    	DescuentoFijo desc1 = new DescuentoFijo();
    	desc1.setValorDescuento(14);
    	
    	DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
    	desc2.setValorDescuento(0.3);
    	
    	DescuentoPorcentajeConTope desc3 = new DescuentoPorcentajeConTope();
    	desc3.setValorDescuento(0.2);
    	
    	DescuentoPorcentajeConTope tope = new DescuentoPorcentajeConTope();
       	tope.setValorDescuento(0.4);
       	
    	
    	System.out.println(desc1.valorFinal(100));   
    	System.out.println(desc2.valorFinal(100)); 
    	System.out.println(desc3.valorFinal(100));
    	
    	
		//Instancie una persona
		Persona nahuel = new Persona("Nahuel","Ramirez");
		
		//Instancie 3 productos
		Producto harina = new Producto("harina",100.0);
		Producto roastBeef = new Producto("roast beef",1250.5);
		Producto leche = new Producto("leche",250.0);
		
		//Instanciar ItemProductos
		
		ItemCarrito item1 = new ItemCarrito(harina,13);
		ItemCarrito item2 = new ItemCarrito(roastBeef,1);
		ItemCarrito item3 = new ItemCarrito(leche,3);
		
		//Creo un carrito y agrego items
		
		Carrito unCarrito = new Carrito();
		
		unCarrito.agregarItem(item1);
		unCarrito.agregarItem(item2);
		
		System.out.println("Costo final del carrito es: "+unCarrito.costoFinal());
    	
		System.out.println("Costo final del carrito usando descuento fijo:"+unCarrito.costoFinal(desc1));
		System.out.println("Costo final del carrito usando descuento porcentaje:"+unCarrito.costoFinal(desc2));
		
		try {
			System.out.println("Costo final solo si hay stock:"+
							unCarrito.costoFinalSiHayStock());
		} catch (SinStockException e) {
			System.out.println("No hay stock del producto:"+e.getProducto().getNombre());
		}
		
		System.out.println("Costo final del carrito usando descuento porcentaje:"+unCarrito.costoFinal(desc2));
				
	
    }
}
