package descuento.contexto;
import descuento.interfaz.DescuentoStrategy;


public class Contexto {
	private DescuentoStrategy descuentoStrategy;

	public Contexto(DescuentoStrategy descuentoStrategy) {
		this.descuentoStrategy = descuentoStrategy;
	}

//METODOS
	public double aplicarEstrategia(double cantidad) {			
		return descuentoStrategy.aplicarDescuento(cantidad);
	}

}
