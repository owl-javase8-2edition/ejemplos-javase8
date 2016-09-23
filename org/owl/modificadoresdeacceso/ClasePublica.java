package org.owl.modificadoresdeacceso;

public class ClasePublica {

	protected class InnerClass {

	}

	public String saludo = "Hola";
	private int indice = 0;
	int edad = 28;
	protected long time;

	public static void main(String[] args) {
		ClasePublica p = new ClasePublica();
		p.indice = 2;
		p.edad = 5;
		p.time = 79;
	}
}

public class ClaseTest {

}

class B {

}