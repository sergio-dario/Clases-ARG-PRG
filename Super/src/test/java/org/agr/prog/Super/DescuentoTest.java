package org.agr.prog.Super;

import static org.junit.Assert.assertNotEquals;

import org.arg.prog.Super.models.DescuentoFijo;
import org.arg.prog.Super.models.DescuentoPorcentajeConTope;
import org.arg.prog.Super.models.ItemCarrito;
import org.arg.prog.Super.models.Producto;
import org.arg.prog.Super.models.DescuentoPorcentaje;
import org.arg.prog.Super.models.Carrito;
import org.junit.Test;

public class DescuentoTest {
	@Test
	public void TestDescuentoFijo() {
		
    	DescuentoFijo desc1 = new DescuentoFijo();
    	desc1.setValorDescuento(14);
		
    	//Instancie 3 productos
    			Producto harina = new Producto("harina",100.0);
    			Producto roastBeef = new Producto("roast beef",1250.5);
    			Producto leche = new Producto("leche",250.0);

    	    	ItemCarrito item1 = new ItemCarrito(harina,3);
    	    	ItemCarrito item2 = new ItemCarrito(roastBeef,1);
    	    	ItemCarrito item3 = new ItemCarrito(leche,3);

    	    	Carrito unCarrito = new Carrito();
    	    	
    	    	unCarrito.agregarItem(item1);
    	    	unCarrito.agregarItem(item2); 	
    	    	
    	    	assertNotEquals(unCarrito.costoFinal(),unCarrito.costoFinal(desc1));
	}
    	    	@Test
    	 public void TestDescuentoPorcentaje() {    	
   
    	    		DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
    	        	desc2.setValorDescuento(0.3);
    			
    	    	//Instancie 3 productos
    	    			Producto harina = new Producto("harina",100.0);
    	    			Producto roastBeef = new Producto("roast beef",1250.5);
    	    			Producto leche = new Producto("leche",250.0);

    	    	    	ItemCarrito item1 = new ItemCarrito(harina,3);
    	    	    	ItemCarrito item2 = new ItemCarrito(roastBeef,1);
    	    	    	ItemCarrito item3 = new ItemCarrito(leche,3);

    	    	    	Carrito unCarrito = new Carrito();
    	    	    	
    	    	    	unCarrito.agregarItem(item1);
    	    	    	unCarrito.agregarItem(item2); 	
    	    	    	
    	    	    	assertNotEquals(unCarrito.costoFinal(),unCarrito.costoFinal(desc2));	                    
	}
    	     	@Test
    	    	 public void TestDescuentoConTope() {    	
    	   
    	     		DescuentoPorcentajeConTope desc3 = new DescuentoPorcentajeConTope();
    	        	desc3.setValorDescuento(0.2);
    	    			
    	    	    	//Instancie 3 productos
    	    	    			Producto harina = new Producto("harina",100.0);
    	    	    			Producto roastBeef = new Producto("roast beef",1250.5);
    	    	    			Producto leche = new Producto("leche",250.0);

    	    	    	    	ItemCarrito item1 = new ItemCarrito(harina,3);
    	    	    	    	ItemCarrito item2 = new ItemCarrito(roastBeef,1);
    	    	    	    	ItemCarrito item3 = new ItemCarrito(leche,3);

    	    	    	    	Carrito unCarrito = new Carrito();
    	    	    	    	
    	    	    	    	unCarrito.agregarItem(item1);
    	    	    	    	unCarrito.agregarItem(item2); 	
    	    	    	    	
    	    	    	    	assertNotEquals(unCarrito.costoFinal(),unCarrito.costoFinal(desc3));
    	     	}
    	   
   	        	
   	        	
}
