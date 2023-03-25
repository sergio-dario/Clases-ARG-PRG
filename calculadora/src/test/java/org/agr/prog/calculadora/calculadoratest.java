package org.agr.prog.calculadora;



import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class calculadoratest {
	
	@Test
	public void dados_NE_AlMultiplicar_ElResultadoEsperadoEs() {
		Integer numero1=80;
        Integer numero2=3;
        Integer resultadoEsperado=240;
        assertEquals(resultadoEsperado, calculadora.multiplicar(numero1,numero2));
	} 
        @Test
    	public void dados_NE_AlSumarYDividir_ElResultadoEsperadoEs() {
    		Integer numero1=150;
            Integer numero2=180;
            Integer numero3=3;
            Integer resultadoEsperado=110;
            assertEquals(resultadoEsperado,calculadora.dividir(calculadora.sumar(numero1, numero2), numero3));   
        }
        @Test
    	public void dados_NE_AlRestarYMultiplicar_ElResultadoEsperadoEs() {
    		Integer numero1=90;
            Integer numero2=50;
            Integer numero3=15;
            Integer resultadoEsperado=605;
            assertEquals(resultadoEsperado,calculadora.multiplicar(calculadora.resta(numero1, numero2), numero3));  
        }   
        @Test
    	public void dados_NE_AlSumaYMultiplicar_ElResultadoEsperadoEs() {
    		Integer numero1=70;
            Integer numero2=40;
            Integer numero3=25;
            Integer resultadoEsperado=605;
            assertEquals(resultadoEsperado,calculadora.multiplicar(calculadora.sumar(numero1, numero2), numero3));  
	}

}
