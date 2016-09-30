package org.owl.modificadoresdeacceso.paquetedos;

import org.owl.modificadoresdeacceso.ClasePublica;

class ClaseUasuaria {

	String nombre;
	
	public static void main(String[] args) {
		ClasePublica p = new ClasePublica();
		p.saludo = p.saludo + " Mundo!";
		p.indice = 1;
		p.edad=35;
	}
}