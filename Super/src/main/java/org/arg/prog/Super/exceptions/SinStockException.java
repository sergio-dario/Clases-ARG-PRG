package org.arg.prog.Super.exceptions;

import org.arg.prog.Super.models.Producto;

public class SinStockException extends Exception{

	private final Producto producto;
	
	public SinStockException(Producto producto) {
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}	
	
}
