package descuento.cliente;

import descuento.contexto.Contexto;
import descuento.estrategias.*;
import descuento.interfaz.DescuentoStrategy;

public class ClienteEjemplo {

	public static void main(String[] args) {
		
		DescuentoStrategy descuentoStrategy = getStrategy(64);		
		Contexto contexto = new Contexto(descuentoStrategy);
		System.out.println("Descuento de 64€ = " + contexto.aplicarEstrategia(64) + "€");
		
		descuentoStrategy = getStrategy(350);		
		contexto = new Contexto(descuentoStrategy);
		System.out.println("Descuento de 350€ = " + contexto.aplicarEstrategia(350) + "€");
		
		descuentoStrategy = getStrategy(742);		
		contexto = new Contexto(descuentoStrategy);
		System.out.println("Descuento de 742€ = " + contexto.aplicarEstrategia(742) + "€");
	}//FIN MAIN

	private static DescuentoStrategy getStrategy(double cantidad) {
		DescuentoStrategy estrategia = null;
		if(cantidad >= 50 && cantidad < 100) {
			estrategia = new DescuentoCincuenta();
		}else if(cantidad >= 100 && cantidad < 500) {
			estrategia = new DescuentoCien();
		}else if(cantidad > 500) {
			estrategia = new DescuentoQuinientos();
		}
		return estrategia;
	}
}//FIN CLASS
