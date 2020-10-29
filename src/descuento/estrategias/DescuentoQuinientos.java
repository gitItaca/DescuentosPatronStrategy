package descuento.estrategias;

import descuento.interfaz.DescuentoStrategy;

public class DescuentoQuinientos implements DescuentoStrategy{

	@Override
	public double aplicarDescuento(double cantidad) {
		cantidad = cantidad - (cantidad * 0.2);
		return cantidad;
	}

}
