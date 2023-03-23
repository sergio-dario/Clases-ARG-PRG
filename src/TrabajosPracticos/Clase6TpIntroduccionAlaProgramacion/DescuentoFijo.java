package Clase6TpIntroduccionAlaProgramacion;

public class DescuentoFijo extends Descuento{

	@Override
	public double ValorFinal(double valorInicial) {
		return valorInicial - this.getValorDescuento();
	}

	}


