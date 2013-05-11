package de.openjobs.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.AsParameterConverter;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import de.openjobs.entities.Arbeitgeber;
import de.openjobs.entities.Stellenangebot;

public class VermittlungsSteps {

	private Arbeitgeber arbeitgeber;
	private Stellenangebot stellenangebot;

	public VermittlungsSteps() {
		super();
	}

	@AsParameterConverter
	public Stellenangebot erstelleStellenangebot(String tokenName) {
		if ("Stellenangebot".equals(tokenName)) {
			return stellenangebot;
		} else {
			Assert.fail();
		}
		return null;
	}
	
	@AsParameterConverter
	public Arbeitgeber erstelleArbeitgeber(String tokenName) {
		if ("Arbeitgeber".equals(tokenName)) {
			return arbeitgeber;
		} else {
			Assert.fail();
		}
		return null;
	}

	@Given("ein Arbeitgeber")
	public Arbeitgeber registriereArbeitgeber() {
		// Fehleranfälliger Punkt hier wäre NatSpec besser !!!
		arbeitgeber = new Arbeitgeber();
		return arbeitgeber;
	}

	@When("dieser $Arbeitgeber registriert wurde")
	public void istEinArbeitgeber(Arbeitgeber arbeitgeber) {
		Assert.assertNotNull(arbeitgeber);
	}

	@When("ein Stellenangebot vom $Arbeitgeber erstellt wurde")
	public Stellenangebot erstelleStellenangebot(
			@Named("Arbeitgeber") Arbeitgeber arbeitgeber) {
		stellenangebot = this.arbeitgeber.erstelleStellenangebot();
		return stellenangebot;
	}

	@When("ein valides $Stellenangebot vorliegt")
	public void istEinStellenangebot(
			@Named("Stellenangebot") Stellenangebot stellenangebot) {
		Assert.assertNotNull(stellenangebot);
	}

	@When("das $Stellenangebot $anzahl Stelle zur Vermittlung bietet")
	public void setzeMaxAnzahlStellen(
			@Named("Stellenangebot") Stellenangebot stellenangebot,
			@Named("anzahl") Integer anzahl) {
		stellenangebot.setAnzahlStellen(anzahl);
	}

	@Then("kann das $Stellenangebot noch auf $anzahl Stelle vermittelt werden")
	public void vermittelbarAufStellen(
			@Named("Stellenangebot") Stellenangebot stellenangebot,
			@Named("anzahl") Integer anzahl) {
		final Integer stellen = stellenangebot.getAnzahlStellen();
		Assert.assertEquals(anzahl, stellen);
	}
	//
	// @TextSyntax("Der Arbeitssuchende erstellt ein Stellengesuch.")
	// public Stellengesuch createStellengesuch() {
	// return new Stellengesuch();
	// }
	//
	// @TextSyntax("Es liegt ein valides #1 vor.")
	// public void istEinStellengesuch(Stellengesuch stellengesuch) {
	// Assert.assertNotNull(stellengesuch);
	// }
	//
	// @TextSyntax("Registrierung eines Arbeitssuchenden.")
	// public Arbeitssuchender registriereArbeitssuchender() {
	// return new Arbeitssuchender();
	// }
	//
	// @TextSyntax("Es liegt ein registrierter #1 vor.")
	// public void istEinArbeitssuchender(Arbeitssuchender arbeitssuchender) {
	// Assert.assertNotNull(arbeitssuchender);
	// }
	//
	//
	// @TextSyntax("Der registrierte #1 erstellt zum #2 eine Bewerbung.")
	// public Bewerbung bewirbtSichAufStellenangebot(Arbeitssuchender
	// arbeitssuchender, Stellenangebot stellenangebot) {
	// return arbeitssuchender.erstelleBewerbung(stellenangebot);
	// }
	//
	// @TextSyntax("Damit liegt eine gültige Bewerbung vor.")
	// public void istEineBewerbung(Bewerbung bewerbung) {
	// Assert.assertNotNull(bewerbung);
	// }
	//
	// @TextSyntax("Der #1 wird vom #2 eingestellt und damit wird eine Stelle des #3 besetzt.")
	// public void einstellenArbeitssuchenden(Arbeitssuchender arbeitssuchender,
	// Arbeitgeber arbeitgeber, Stellenangebot stellenangebot ) {
	// stellenangebot.verringereStellenUm(1);
	// }

}
