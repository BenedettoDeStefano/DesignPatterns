package ES3.Entities;

public class Tenente extends Ufficiali {

	public Tenente() {
		super(3000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Tenente non può effettuare questa richiesta");
		}

	}
}