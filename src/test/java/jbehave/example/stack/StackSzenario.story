Meta:
@author FunThomas424242

Erzählung:
Um in einem Java Programm einen Stapel von Dingen abarbeiten zu können
Als Entwickler
Möchte ich Schnittstellen und Implementierungen aus Java direkt nutzen
Damit ich keine eigene Stackverwaltung bauen muss.

 

Szenario:  Leerer Stack

Meta:
@themes Stack

Gegeben sei ein leerer Stack.
Wenn keine Operation auf dem Stack ausgeführt wird
Dann enthält der Stack 0 Elemente.

Szenario:  Ein Elementiger Stack

Meta:
@themes Stack

Gegeben sei ein leerer Stack.
Wenn das Element 0 hinzugefügt wird
Dann enthält der Stack 1 Element.


Szenario:  Grundlegende Stack Funktionen
Meta:
@themes Stack

Gegeben sei ein leerer Stack.
Wenn das Element Java hinzugefügt wird
Und das Element 7 hinzugefügt wird
Wenn das oberste Element vom Stack entfernt wird
Dann liegt das Element Java ganz oben auf dem Stack.

Szenario:  Stack Suche
Meta:
@themes Stack

Gegeben sei ein leerer Stack.
Wenn das Element Java hinzugefügt wird
Und das Element C++ hinzugefügt wird
Wenn das Element PHP hinzugefügt wird
Und das Element Java gesucht wird
Dann ist die erwartete Position 3.

Szenario:  Stack Suche doppelter Eintrag
Meta:
@themes Stack

Gegeben sei ein leerer Stack.
Wenn das Element Java hinzugefügt wird
Und das Element C++ hinzugefügt wird
Wenn das Element Java hinzugefügt wird
Und das Element PHP hinzugefügt wird
Wenn das Element Java gesucht wird
Dann ist die erwartete Position 2.