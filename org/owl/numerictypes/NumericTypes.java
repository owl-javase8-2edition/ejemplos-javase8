package org.owl.numerictypes;

public class NumericTypes {
	
	static {
		//8 bits o 1 byte
		byte byteMinimo = -128;
		byte byteMaximo = 127;

		//16 bits o 2 bytes
		short shortMinimo = -32768;
		short shortMaximo = 32767;

		//32 bits o 4 bytes
		int intMinimo = -2147483648;
		int intMaximo = 2147483647;

		//64 bits o 8 bytes
		long longMinimo = -9223372036854775808L;
		long longMaximo = 9223372036854775807L;

		//32 bits 
		float floatMinimo = Float.MIN_VALUE;
		float floatMaximo = Float.MAX_VALUE;
		System.out.println(floatMinimo);
		System.out.println(floatMaximo);

		//64 bits 
		double doubleMinimo = Double.MIN_VALUE;
		double doubleMaximo = Double.MAX_VALUE;
		System.out.println(doubleMinimo);
		System.out.println(doubleMaximo);

		//16 bits  o 2 bytes
		char c = '\u0041';

		//N/A
		boolean booleanTrue = true;
		boolean booleanFalse = false; Boolean.false
		
	}

	public static void main(String[] args) {

	}
}