package org.owl.herencia;

import java.util.Date;

public class Empleado {

	public static final float SALARIO_MINIMO;

	public static void metodoDeClase() {
		System.out.println("Hola desde el método de clase.");
	}
	
	static {
		System.out.println("Se ejecuto el inicializador de clase 1");
		SALARIO_MINIMO = 1824000.0f;
	}

	{
		System.out.println("Se ejecuto el inicializador de instancia 1");
		idEmpleado = 59;
	}
	
	static {
		System.out.println("Se ejecuto el inicializador de clase 2");
	}

	protected int idEmpleado;

	protected float salario;
	
	{
		System.out.println("Se ejecuto el inicializador de instancia 2");
		salario = 1800000.0f;
	}

	private Date fechaAlta = new Date();
	private int cantidadHijosMenores;

	public Empleado() {
		System.out.println("Se ejecuto el constructor");
		salario = 1950000.0f;
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

	public float calcularLiquidacion() {
		System.out.println("Liquidando Empleado...");
		return 0.0f;
	}

	public static void main(String[] args) {
		
		Empleado e = new Gerente();
		Gerente.metodoDeClase();
		System.out.println(Gerente.SALARIO_MINIMO);
	}
}