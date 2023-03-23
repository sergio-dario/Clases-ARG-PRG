package Clase6TpIntroduccionAlaProgramacion;

public class Item {
	  private int cantidad;
	    private double precio;
	    private String producto;

	    public Item(int cantidad, double precio, String producto) {
	        this.cantidad = cantidad;
	        this.precio = precio;
	        this.producto = producto;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String getProducto() {
	        return producto;
	    }
	}

