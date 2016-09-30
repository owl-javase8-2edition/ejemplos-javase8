package org.owl.interfaces;

public class TestFigura {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(5.2f);
		Rectangulo r = new Rectangulo(64.0f, 20.4f);
		Triangulo t = new Triangulo(8.0f, 12.0f);

		Figura[] figuras = new Figura[] {c, r, t};

		FabricaFiguras fabrica = new FabricaFiguras(figuras);
		System.out.println("El area total de todas las figuras = "
						+fabrica.sumarAreasFiguras());

	}
}