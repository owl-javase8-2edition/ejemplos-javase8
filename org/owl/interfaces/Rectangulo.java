package org.owl.interfaces;

public class Rectangulo implements Figura {
	private float largo;
	private float ancho;

	public Rectangulo(float largo, float ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	public float getArea() {
		return largo*ancho;
	}
}