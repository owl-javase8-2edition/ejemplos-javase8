package org.owl.herencia;

import java.util.Date;

public class Gerente extends Empleado {
	protected int idEmpleado = 0003;

	static {
		System.out.println("Carga de la clase Gerente");
	}

	public Gerente() {
	}

	public Gerente(float salario, Date fechaAlta, int cantidadHijosMenores) {
		super(salario, fechaAlta, cantidadHijosMenores);
	}

	@Override
	public float calcularLiquidacion() {
		System.out.println("Liquidando Gerente...");
		return 45008451.0f;
	}

	public void metodoPropio() {

	}
}