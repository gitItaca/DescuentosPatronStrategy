package descuento.estrategias;

import descuento.interfaz.DescuentoStrategy;

public class DescuentoCien implements DescuentoStrategy{

	@Override
	public double aplicarDescuento(double cantidad) {
		cantidad = cantidad - (cantidad * 0.1);
		return cantidad;
	}

}
