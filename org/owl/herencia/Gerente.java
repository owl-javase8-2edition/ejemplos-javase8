package org.owl.herencia;

import java.util.Date;

public class Gerente extends Empleado {
	public int idEmpleado = 0003;
	public Gerente(float salario, Date fechaAlta, int cantidadHijosMenores) {
		super(salario, fechaAlta, cantidadHijosMenores);
	}

	public float calcularLiquidacion() {
		System.out.println("Liquidando Gerente...");
		return 45008451.0f;
	}

}