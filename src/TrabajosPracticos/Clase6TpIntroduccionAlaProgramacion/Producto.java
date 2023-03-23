package Clase6TpIntroduccionAlaProgramacion;

import java.time.LocalDate;
import java.util.List;

public class Producto {
	
		
			private String nombre;
			private String descripcion;
			private LocalDate fechaAlta;
			private Integer pesoKg;
			private Double precio;
			private Integer cant;
			
			
			public Producto(Integer cant, Double precio,String nombre ) {
				this.cant = cant;
				this.precio = precio;
				this.nombre= nombre;
				
			}
			public Producto(List<String> readAllLines) {
				
				
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getDescripcion() {
				return descripcion;
			}
			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}
			public LocalDate getFechaAlta() {
				return fechaAlta;
			}
			public void setFechaAlta(LocalDate fechaAlta) {
				this.fechaAlta = fechaAlta;
			}
			public Integer getPesoKg() {
				return pesoKg;
			}
			public void setPesoKg(Integer pesoKg) {
				this.pesoKg = pesoKg;
			}
			public Double getPrecio() {
				return precio;
			}
			public void setPrecio(Double precio) {
				this.precio = precio;
			}
			public Integer getCant() {
				return cant;
			}
			public void setCant(Integer cant) {
				this.cant = cant;
			}

}
