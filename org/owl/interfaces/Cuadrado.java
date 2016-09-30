package org.owl.interfaces;

public class Cuadrado implements Figura {
	
	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	public float getArea() {
		return lado*lado;
	}
}