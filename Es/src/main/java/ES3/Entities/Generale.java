package ES3.Entities;

public class Generale extends Ufficiali {

	public Generale() {
		super(5000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Generale non può effettuare questa richiesta");
		}

	}
}
