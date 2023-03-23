package Clase6TpIntroduccionAlaProgramacion;

public abstract class Descuento {
	private double valor;

	public double getValorDescuento() {
		return valor;
	}

	public void setValorDescuento(double valor) {
		this.valor = valor;
	}
	public abstract double ValorFinal(double valorFinal);

}
