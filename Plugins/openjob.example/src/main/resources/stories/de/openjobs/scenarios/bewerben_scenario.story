Narrative:
In order um Arbeitssuchende vermitteln zu können
As ein Arbeitsvermittler
I would like zu nutzen ein Programm zur Vermittlung.
 
Scenario:  Grund Funktionalität zur Vermittlung
 
Given ein Arbeitgeber
When dieser registriert wurde
And ein Stellenangebot erstellt hat 
And das Stellenangebot eine zu vermittelnde Stelle beinhaltet
Then kann eine Stelle vermittelt werden
 
Scenario:  Stack search
 
Given an empty stack
When the string Java is added
And the string C++ is added
And the string PHP is added
And the element Java is searched for
Then the position returned should be 3


Registrierung eines Arbeitgeber.
Es liegt ein gültiger Arbeitgeber vor.  

Der Arbeitgeber erstellt ein Stellenangebot.
Es liegt ein valides Stellenangebot vor. 

Die Anzahl der Stellen vom Stellenangebot wird auf 1 begrenzt.
Jetzt kann das Stellenangebot noch auf 1 Stelle(n) vermittelt werden.

Registrierung eines Arbeitssuchenden.
Es liegt ein registrierter Arbeitssuchender vor.

Der registrierte Arbeitssuchende erstellt zum Stellenangebot eine Bewerbung.
Damit liegt eine gültige Bewerbung vor.

Der Arbeitssuchende wird vom Arbeitgeber eingestellt und damit wird eine Stelle des Stellenangebotes besetzt.
Jetzt kann das Stellenangebot noch auf 0 Stelle(n) vermittelt werden.

// 2. Arbeitssuchender
Registrierung eines Arbeitssuchenden.
// Hier liegt ein Fehler vor -> es wird der erste AS geprüft.
Es liegt ein registrierter Arbeitssuchender vor. 

Der Arbeitssuchende erstellt ein Stellengesuch. 
Es liegt ein valides Stellengesuch vor.

