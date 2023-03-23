package Clase6TpIntroduccionAlaProgramacion;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double ValorFinal(double valorInicial) {
		
		return valorInicial - (valorInicial * this.getValorDescuento());
	}
	
	

}
