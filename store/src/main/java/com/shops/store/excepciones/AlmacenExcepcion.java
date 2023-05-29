package com.shops.store.excepciones;

public class AlmacenExcepcion extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AlmacenExcepcion(String mensaje) {
		super(mensaje);
	}

	public AlmacenExcepcion(String mensaje, Throwable exception) {
		super(mensaje, exception);
	}
	
}
