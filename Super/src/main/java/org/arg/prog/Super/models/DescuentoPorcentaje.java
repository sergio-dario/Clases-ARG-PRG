package org.arg.prog.Super.models;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - (valorInicial * this.getValorDescuento());
	}
	
}
