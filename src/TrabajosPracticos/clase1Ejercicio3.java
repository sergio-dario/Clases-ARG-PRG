package tareas;

public class clase13 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int numeroInicio = 5;
		int numeroFin = 14;
		char  pOi = 'p';
		while( numeroInicio <= (numeroFin-1 )){
		       switch ( pOi ) {
		            case 'p': 
		                   if  ((numeroInicio % 2) == 0) {
		                	   System.out.println (numeroInicio);
		                	   }  // Deberia mostrar todos los números pares entre 5 y 14
		break;
		       case 'i':
		                   if  ((numeroInicio % 2) != 0) {
		         
		                	   System.out.println (numeroInicio);}
		                    // Deberia mostrar todos los números impares entre 5 y 14
		break;
		default: 
		                 System.out.println ("error");
		} // debería mostrar error
		numeroInicio++;
		
				}


	}

}
