package org.owl.herencia;

import java.util.Date;

public abstract class Empleado {
	
	public int idEmpleado = 0001;

	protected float salario;
	private Date fechaAlta;
	private int cantidadHijosMenores;

	public Empleado() {

	}

	public Empleado(float salario, Date fechaAlta, int cantidadHijosMenores) {
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.cantidadHijosMenores = cantidadHijosMenores;
	}

	public float calcularBonificacionFamiliar() {
		System.out.println("Liquidando Empleado...");
		return salario * 0.08f * cantidadHijosMenores;
	} 

	public abstract float calcularLiquidacion();

	public float calcularLiquidacion(Date fechaLiquidacion) {
		System.out.println("Liquidando Empleado...");
		return 0.0f;
	}
}