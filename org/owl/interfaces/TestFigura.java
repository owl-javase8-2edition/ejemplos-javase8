package org.owl.interfaces;

public class TestFigura {

	public static void main(String[] args) {
		Figura c = new Cuadrado(5.2f);
		Figura r = new Rectangulo(64.0f, 20.4f);
		Figura t = new Triangulo(8.0f, 12.0f);

		//Figura[] figuras = new Figura[] {c,r,t};

		Figura[] figuras = new Figura[3];
		figuras[0] = c;
		figuras[1] = r;
		figuras[2] = t;

		FabricaFiguras fabrica = new FabricaFiguras(figuras);
		System.out.println("El area total de todas las figuras = "
						+fabrica.sumarAreasFiguras());

	}
}