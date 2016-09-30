package org.owl.modificadoresdeacceso;

public class ClaseHermana {

	public static void main(String[] args) {
		ClasePublica p = new ClasePublica();
		/*
		El miembro edad es publico 
		y puede ser accedido desde cualquier parte.
		*/
		p.edad = 30;
	}
}