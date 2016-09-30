package org.owl.interfaces;

public class Triangulo implements Figura {
	private float base;
	private float altura;

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getArea() {
		return base*altura/2;
	}
}