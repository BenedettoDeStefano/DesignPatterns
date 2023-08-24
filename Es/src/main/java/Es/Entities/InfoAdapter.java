package Es.Entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import Es.Interface.DataSource;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InfoAdapter implements DataSource {

	private Info info;

	@Override
	public String getFullName() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getAge() {
		LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate oggi = LocalDate.now();

		Period periodo = Period.between(dataDiNascita, oggi);
		return periodo.getYears();
	}

}
