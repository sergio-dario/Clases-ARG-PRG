package Clase6TpIntroduccionAlaProgramacion;


import java.util.ArrayList;

public class Carrito1 {
    private ArrayList<Item> items;
	public Carrito1(ArrayList<Item> items) {
        this.items = items;
    }
    
    private static  Double total = 0.0;
    
    public  Double FinalCosto() {
    	
        for (Item item : items) {
            total += item.getCantidad() * item.getPrecio();
        }
        

        return total;
        
        
    }
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public static Double getTotal() {
		return total;
	}
	public static void setTotal(Double total) {
		Carrito1.total = total;
	}
    
    
}

	





