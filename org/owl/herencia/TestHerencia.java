package org.owl.herencia;

import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {

		Empleado e = new Vendedor(2500000.0f, new Date(), 3);
		System.out.println("ID empleado="+e.idEmpleado);
		System.out.println(e.calcularLiquidacion());
		System.out.println(e.calcularBonificacionFamiliar());

		Gerente ge = new Gerente(10000000.0f, new Date(), 0);
		System.out.println("ID empleado="+ge.idEmpleado);
		System.out.println(ge.calcularLiquidacion());

		System.out.println(ge.calcularBonificacionFamiliar());
	}
}