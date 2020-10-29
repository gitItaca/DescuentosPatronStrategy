package descuento.estrategias;
import descuento.interfaz.DescuentoStrategy;

public class DescuentoCincuenta implements DescuentoStrategy{

	@Override
	public double aplicarDescuento(double cantidad) {
		cantidad = cantidad - (cantidad * 0.05);
		return cantidad;
	}

}
