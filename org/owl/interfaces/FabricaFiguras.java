package org.owl.interfaces;

public class FabricaFiguras {
	
	private Figura[] figuras;

	public FabricaFiguras(Figura[] figuras) {
		this.figuras = figuras;
	}

	public float sumarAreasFiguras() {
		float areaTotal = 0;
		for(Figura fig:figuras) {
			areaTotal += fig.getArea();
		}

		return areaTotal;
	}
}