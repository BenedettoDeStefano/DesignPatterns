package ES2.Entities;

import ES2.Interface.Element;
import lombok.Getter;

@Getter
public class Pagina implements Element {
	private int numeroPagine;

	public Pagina(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public void stampa() {
		System.out.println("Stampa Pagina - Numero Pagine: " + numeroPagine);
	}
}
