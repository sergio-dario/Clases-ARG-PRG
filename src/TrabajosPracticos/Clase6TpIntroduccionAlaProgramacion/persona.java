package Clase6TpIntroduccionAlaProgramacion;

import java.time.LocalDateTime;

public class persona {
	
		private String nombre;
		private String apellido;
		private LocalDateTime fechaDeNacimiento;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public LocalDateTime getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}
		public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}
		
		

}
