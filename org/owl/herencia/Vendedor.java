package org.owl.herencia;

import java.util.Date;

public class Vendedor extends Empleado {
	public int idEmpleado = 0002;
	public Vendedor(float salario, Date fechaAlta, int cantidadHijosMenores) {
		super(salario, fechaAlta, cantidadHijosMenores);
	}

	@Override
	public float calcularLiquidacion() {
		this.salario = 0;
		System.out.println("Liquidando Vendedor...");
		return 15008451.0f;
	}

	@Override
	public float calcularLiquidacion(Date fechaLiquidacion) {
		System.out.println("Liquidando Vendedor...");
		return 0.0f;
	}

	public void calcularComisiones(float montoVentas, int montoDevoluciones) {

	}
}