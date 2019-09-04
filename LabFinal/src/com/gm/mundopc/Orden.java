package com.gm.mundopc;

public class Orden {
	private final int idOrden;
	private final Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int maxComputadoras = 10;

	public Orden() {
		this.idOrden = ++contadorOrdenes;
		computadoras = new Computadora[maxComputadoras];
	}

	public void agregarComputadora(Computadora computadora) {
		if (contadorComputadoras < maxComputadoras) {
			// Agregamos la nueva computadora al arreglo
			// e incrementamos el contador de computadoras
			computadoras[contadorComputadoras++] = computadora;
		} else {
			System.out.println("Se ha superado el maximo de productos: "
					+ maxComputadoras);
		}
	}

	public double calcularTotal() {
		return 0.0;
	}

	public void mostrarOrden() {
		System.out.println("Orden #:" + idOrden);
		System.out.println("Computadoras de la orden #" + idOrden + ":");
		for (int i = 0; i < contadorComputadoras; i++) {
			System.out.println(computadoras[i]);
		}
	}
}
