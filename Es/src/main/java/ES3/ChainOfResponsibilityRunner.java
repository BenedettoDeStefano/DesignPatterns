package ES3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ES3.Entities.Capitano;
import ES3.Entities.Colonnello;
import ES3.Entities.Generale;
import ES3.Entities.Maggiore;
import ES3.Entities.Ufficiali;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Ufficiali generale = new Generale();
		Ufficiali colonnello = new Colonnello();
		Ufficiali maggiore = new Maggiore();
		Ufficiali capitano = new Capitano();

		generale.setUfficialeSuperiore(null);
		capitano.setUfficialeSuperiore(maggiore);
		maggiore.setUfficialeSuperiore(colonnello);
		colonnello.setUfficialeSuperiore(generale);

		int importo = 4000;
		capitano.gestisciRichiesta(importo);
	}

}
