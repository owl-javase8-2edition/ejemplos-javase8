package org.owl.scoping;

public class ScopeTest {
	static final String VERSION = "1.1";
	String s = null;
	int i = 0;

	public void saludar() {
		String saludo = s;
		System.out.println(s);
	}

	public void realizarAccion(String cadena) {
		cadena = "123456";
		System.out.println(cadena);
		saludar();
	}

	public static void main(String[] args) {
		ScopeTest st = new ScopeTest();
		String cadena = "Foo";
		st.realizarAccion(cadena);
		System.out.println(cadena);
		System.out.println(ScopeTest.VERSION);
	} 
}
