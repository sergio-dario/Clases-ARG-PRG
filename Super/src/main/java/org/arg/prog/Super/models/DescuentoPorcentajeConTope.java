	package org.arg.prog.Super.models;

	public  class DescuentoPorcentajeConTope extends Descuento{

		@Override
		public double valorFinal(double valorInicial) {
			return valorInicial - (valorInicial*this.getValorDescuento());
		
		
		
		}

	}
		

		
		
		
	
