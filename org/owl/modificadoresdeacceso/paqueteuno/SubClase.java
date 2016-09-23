package org.owl.modificadoresdeacceso.paqueteuno;

import org.owl.modificadoresdeacceso.ClasePublica;

class SubClase extends ClasePublica {
	
	public static void main(String[] args) {
		SubClase p = new SubClase();
		/*Este miembro es heredado 
			y puede ser accedido por ser protected*/
		p.time = 79;
	}
}