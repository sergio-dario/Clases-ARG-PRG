package org.arg.prog.Super.models;

public class DescuentoFijo extends Descuento{

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValorDescuento();
	}

}
