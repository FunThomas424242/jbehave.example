package de.openjobs.entities;

public class Stellenangebot {

	private Integer anzahlStellen;

	public Integer getAnzahlStellen() {
		return anzahlStellen;
	}

	public void setAnzahlStellen(final Integer anzahl) {
		this.anzahlStellen=anzahl;		
	}

	public void verringereStellenUm(Integer i) {
		this.anzahlStellen--;
	}

}
