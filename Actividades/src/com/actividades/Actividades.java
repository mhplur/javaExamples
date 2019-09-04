package com.actividades;

import java.util.Scanner;

public class Actividades {

	private static Scanner entradaEscaner;

	public static void main(String[] args) {
		// manejadorVariables();
		// manejadorCadenas();
		// manejadorOperadores();
		// manejadorPrecedenciaOperadores();
		// manejadorIfElse();
		// manejadorSwitch();
		// manejadorWhile();
		// manejadorWhile2();
		// manejadorDoWhile();
		// manejadorDoWhile2();
		// manejadorFor();
		manejadorFor2();
	}

	public static void manejadorVariables() {
		// Variables boolean, declaracion
		boolean bool1;
		// inicializacion
		bool1 = true;
		// Declaracion e inicializacion
		boolean bool2 = false;
		System.out.println("Valor bool1:" + bool1);
		System.out.println("Valor bool2:" + bool2);
		System.out.println("");

		// Variables byte
		byte b1 = 10;
		// Literal en hexadecimal
		byte b2 = 0xa;
		System.out.println("Valor byte1:" + b1);
		System.out.println("Valor byte2:" + b2);
		System.out.println("");

		// Variables short
		short s1 = 2;
		System.out.println("Valor char1:" + s1);
		System.out.println("");

		// Variable char, declaracion e inicializacion en una sola linea
		// La primera declaración es en UNICODE
		// http://www.icursos.net/referencias/TablaUnicode.html

		char ch1 = 65, ch2 = 'A';
		System.out.println("Valor char1:" + ch1);
		System.out.println("Valor char2:" + ch2);
		System.out.println("");

		// Variable enteras
		int decimal = 100;
		int octal = 0144;// Valor octal inicia con 0
		int hexa = 0x64;// Valor hexadecimal onicia con 0x
		System.out.println("Valor int decimal:" + decimal);
		System.out.println("Valor int octal:" + octal);
		System.out.println("Valor int hexadecimal:" + hexa);
		System.out.println();

		// Variables long
		long long1 = 10, long2 = 20L;
		System.out.println("Valor long1:" + long1);
		System.out.println("Valor long2:" + long2);
		System.out.println();

		// Variables float
		float f1 = 15, f2 = 22.3F;
		System.out.println("Valor float1:" + f1);
		System.out.println("Valor float2:" + f2);
		System.out.println();

		// Variables double
		double d1 = 11.0, d2 = 30.15D;
		System.out.println("Valor double1:" + d1);
		System.out.println("Valor double2:" + d2);
		System.out.println();
	}

	public static void manejadorCadenas() {
		String nombre = "Karla";
		String apellido = "Esparza";

		System.out.println("Concatenacion:" + nombre + apellido);

		System.out.println("Nueva linea: \n" + nombre + " " + apellido);

		System.out.println("Tabulador: \t" + nombre + " " + apellido);

		System.out.println("Retroceso:\b" + nombre + " " + apellido);

		System.out.println("Retorno de carro: \r" + nombre + " " + apellido);

//		System.out.println("Comilla simple: '" + nombre + " " + apellido + "'");

		System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");

	}

	public static void manejadorOperadores() {
		System.out.println("Operadores Aritmeticos:");
		int a = 1 + 2;
		int b = a * 4;
		int c = b / 2;
		int d = c - a;
		int e = -d;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);

		System.out.println("\nOperador Módulo (residuo):");
		System.out.println("x mod 10 = " + a % 2);

		System.out.println("\nOperador Compuesto:");
		// a = a + 4
		a += 2;
		b -= 4;
		c *= a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("\nOperador Incremento:");
		// int a = a + 1;
		// Puede reescribierse como
		a++;
		System.out.println("a = " + a);

		// Preincremento/decremento (se incrementa antes de asignar el valor)
		c = ++a;
		// Postincremento/decremento (se incrementa despues de asignar el valor)
		// La siguiente vez que se evalua b, es cuando se incrementa
		d = b++;
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		System.out.println("\nOperador relacional:");
		// a es menor que b
		boolean res = a < b;
		System.out.println("res = " + res);

		System.out.println("\nOperador Ternario:");
		int min = (a < b) ? a : b;
		System.out.println("min = " + min);

		System.out.println("\nOperador de Asignación:");
		int i, j, k;
		// cadena de asignación
		i = j = k = 100; // valor de x, y, and z igual a 100
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}

	public static void manejadorPrecedenciaOperadores() {
		System.out.println("Primer Ejemplo Procedencia Operadores");
		int x = 5;
		int y = 10;
		int z = ++x * y--;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		System.out.println("Ejemplo Evaluacion");
		System.out.println(4 + 5 * 6 / 3);
		System.out.println((4 + 5) * (6 / 3));

		System.out.println("Otro Ejemplo Evaluacion");
		System.out.println(1 + 2 - 3 * 4 / 5);
		System.out.println(1 + 2 - (3 * (4 / 5)));

		System.out.println("\nOtro ejemplo");
		// Si detecta una cadena, lo demas lo convierte en cadana
		System.out.println("1 + 2 = " + 1 + 2);
		// Los parentesis rompen esta regla, ya que tiene la mayor prioridad
		System.out.println("(1 + 2) = " + (1 + 2));

		System.out.println("\nOtro ejemplo");
		// El operador + es asociativo a la izquierda
		System.out.println(1 + 2 + "abc");// Detecta una operacion primero
		System.out.println("abc" + 1 + 2);// Detecta una cadena primero

	}

	public static void manejadorIfElse() {
		int mes = 1; // Mes del anio
		String estacion;

		if (mes == 1 || mes == 2 || mes == 12) {
			estacion = "Invierno";
		} else if (mes == 3 || mes == 4 || mes == 5) {
			estacion = "Primavera";
		} else if (mes == 6 || mes == 7 || mes == 8) {
			estacion = "Verano";
		} else if (mes == 9 || mes == 10 || mes == 11) {
			estacion = "Otono";
		} else {
			estacion = "Mes incorrecto";
		}
		System.out.println("La estacion para el mes " + mes + " es: " + estacion);
	}

	public static void manejadorSwitch() {
		int mes = 4; // Mes del anio
		String estacion;

		switch (mes) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Otono";
			break;
		default:
			estacion = "Mes incorrecto";
		}
		System.out.println("La estacion para el mes " + mes + " es: " + estacion);
	}

	public static void manejadorWhile() {
		int contador = 0;
		int limite = 10;
		while (contador < limite) {
			System.out.println("contador = " + contador);
			contador++;
		}
	}

	public static void manejadorWhile2() {
		System.out.println("Por favor introduce el número de elementos a iterar:");
		int maxElementos;
		entradaEscaner = new Scanner(System.in);
		maxElementos = entradaEscaner.nextInt(); // Leemos el valor proporcionado por el usuario
		int contador = 0;// Inicializamos el contador
		while (contador < maxElementos) {
			System.out.println("contador = " + contador);
			contador++;
		}
	}

	public static void manejadorDoWhile() {
		int contador = 0;
		int limite = 11;
		do {
			System.out.println("contador = " + contador);
			contador++;
		} while (contador < limite);
	}

	public static void manejadorDoWhile2() {
		System.out.println("Por favor introduce el número de elementos a iterar:");
		int maxElementos;
		entradaEscaner = new Scanner(System.in);
		maxElementos = entradaEscaner.nextInt(); // Leemos el valor proporcionado por el usuario
		int contador = 0;
		do {
			System.out.println("contador = " + contador);
			contador++;
		} while (contador < maxElementos);
	}

	public static void manejadorFor() {
		int limite = 10;
		for (int contador = 0; contador < limite; contador++) {
			System.out.println("contador = " + contador);
		}
	}

	public static void manejadorFor2() {
		System.out.println("Por favor introduce el número de elementos a iterar:");
		int maxElementos;
		entradaEscaner = new Scanner(System.in);
		maxElementos = entradaEscaner.nextInt(); // Leemos el valor proporcionado por el usuario
		for (int contador = 0; contador < maxElementos; contador++) {
			System.out.println("contador = " + contador);
		}
	}
}
