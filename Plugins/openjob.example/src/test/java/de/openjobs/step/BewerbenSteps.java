package de.openjobs.step;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import de.openjobs.entities.Arbeitgeber;
import de.openjobs.entities.Arbeitssuchender;
import de.openjobs.entities.Bewerbung;
import de.openjobs.entities.Stellenangebot;
import de.openjobs.entities.Stellengesuch;

public class BewerbenSteps {

	public BewerbenSteps() {
		super();
	}

	 @Given("ein Arbeitgeber.")
	public Arbeitgeber registriereArbeitgeber() {
		return new Arbeitgeber();
	}
	
	@When("dieser #1 registriert wurde")
	public void istEinArbeitssuchender(Arbeitgeber arbeitgeber) {
		Assert.assertNotNull(arbeitgeber);
	}
	
//	@TextSyntax("Der Arbeitgeber erstellt ein Stellenangebot.")
//	public Stellenangebot erstelleStellenangebot() {
//		final Arbeitgeber arbeitgeber = new Arbeitgeber();
//		return arbeitgeber.erstelleStellenangebot();
//	}
//
//	@TextSyntax("Es liegt ein valides #1 vor.")
//	public void istEinStellenangebot(Stellenangebot stellenangebot) {
//		Assert.assertNotNull(stellenangebot);
//	}
//
//	@TextSyntax("Die Anzahl der Stellen vom #1 wird auf #2 begrenzt.")
//	public void setzeMaxAnzahlStellen(Stellenangebot stellenangebot,Integer anzahl) {
//		stellenangebot.setAnzahlStellen(anzahl);
//	}
//
//	@TextSyntax("Jetzt kann das #1 noch auf #2 Stelle(n) vermittelt werden.")
//	public void vermittelbarAufStellen(Stellenangebot stellenangebot,Integer anzahl) {
//		final Integer stellen=stellenangebot.getAnzahlStellen();
//		Assert.assertEquals(anzahl, stellen);
//	}
//
//	@TextSyntax("Der Arbeitssuchende erstellt ein Stellengesuch.")
//	public Stellengesuch createStellengesuch() {
//		return new Stellengesuch();
//	}
//
//	@TextSyntax("Es liegt ein valides #1 vor.")
//	public void istEinStellengesuch(Stellengesuch stellengesuch) {
//		Assert.assertNotNull(stellengesuch);
//	}
//	
//	@TextSyntax("Registrierung eines Arbeitssuchenden.")
//	public Arbeitssuchender registriereArbeitssuchender() {
//		return new Arbeitssuchender();
//	}
//	
//	@TextSyntax("Es liegt ein registrierter #1 vor.")
//	public void istEinArbeitssuchender(Arbeitssuchender arbeitssuchender) {
//		Assert.assertNotNull(arbeitssuchender);
//	}
//	
//	
//	/**
//	 * 
//	 * @param arbeitssuchender
//	 * @param stellenangebot
//	 * @return Bewerbung
//	 */
//	@TextSyntax("Der registrierte #1 erstellt zum #2 eine Bewerbung.")
//	public Bewerbung bewirbtSichAufStellenangebot(Arbeitssuchender arbeitssuchender, Stellenangebot stellenangebot) {
//		return arbeitssuchender.erstelleBewerbung(stellenangebot);
//	}
//
//	@TextSyntax("Damit liegt eine gültige Bewerbung vor.")
//	public void istEineBewerbung(Bewerbung bewerbung) {
//		Assert.assertNotNull(bewerbung);
//	}
//
//	@TextSyntax("Der #1 wird vom #2 eingestellt und damit wird eine Stelle des #3 besetzt.")
//	public void einstellenArbeitssuchenden(Arbeitssuchender arbeitssuchender, Arbeitgeber arbeitgeber, Stellenangebot stellenangebot  ) {
//		stellenangebot.verringereStellenUm(1);
//	}

	


	

}
