package de.openjobs.entities;

public class Arbeitssuchender {

	public Bewerbung erstelleBewerbung(Stellenangebot stellenangebot) {
		return new Bewerbung(stellenangebot);
	}

}
