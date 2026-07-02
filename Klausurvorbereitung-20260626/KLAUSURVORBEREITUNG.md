# Klausurvorbereitung SE2 – Projekt „Mensa-Bestellsystem"

Dieses Aufgabenheft bezieht sich auf das beiliegende Projekt **`Mensa-Bestellsystem`**.
Öffne den Projektordner in VS Code und beantworte die Aufgaben direkt unter den Antwortbereichen.

Es gibt drei Aufgabentypen:

- **[Wissen]** – Verständnisfrage zum Code
- **[Lücke]** – ein mit `// TODO` markierter Codeabschnitt muss ausgefüllt werden
- **[Korrektur]** – ein bewusst eingebauter Denkfehler/Sonderfall, der gefunden bzw. bewertet werden muss

Alle Klassen liegen unter `src/de/thi/mensa/…`. Die `App.java` (Default-Paket) ruft pro Thema eine eigene Methode auf.

---

## Kollaboration

Bitte beantworten Sie die Fragen auf unserem gemeinsamen Padlet. Dann können die anderen Studierenden die Antworten auch sehen.

https://padlet.com/snestler/softwareentwicklung-2-bv49hfcmeo79utyn

Fügen Sie bitte über "Feld hinzufügen" eine eigene Spalte ein - und geben Sie als Feldnamen einfach ein anonymes Akronym Ihrer Wahl an.



## Thema 1 – Objektorientierung & Konstruktoren
*Klassen: `modell/Student.java`*

**1.1 [Wissen]** `Student` besitzt drei Konstruktoren. Beschreibe, was beim Aufruf `new Student("Max", 12345)` Schritt für Schritt passiert (Stichwort `this(...)`-Verkettung).

> Antwort: Der Konstruktor Student(String name, int matrikelnummer) wird aufgerufen. Dieser Konstruktor ruft über this(name, matrikelnummer, 0.0) den Konstruktor mit drei Parametern auf: Student(String name, int matrikelnummer, double guthaben). Der Konstruktor ruft per super() den Konstruktor von Objekt auf und setzt dann die drei Instanzvariablen und erhöht die Anzahl der Studenten. 

**1.2 [Wissen]** Der Copy-Konstruktor `Student(Student anderer)` ruft `this(anderer.name, ...)` auf. Warum darf er auf `anderer.name` direkt zugreifen, obwohl `name` `private` ist?

> Antwort: Auf private Instanzvariablen kann das Objekt selbst innerhalb der gleichen Klasse zugreifen. Aber wir können zusätzlich auch auf andere Objekte der gleichen Klasse (hier: anderer) zugreifen.

**1.3 [Wissen]** `anzahlStudenten` ist `static`. Was liefert `Student.getAnzahlStudenten()` zurück, nachdem in `bestellungUndExceptions()` ein Student angelegt wurde – und warum braucht man dafür kein Objekt?

> Antwort: Die Anzahl ist 1. Da die Methode static ist, kann sie über die Klasse aufgerufen werden.

**1.4 [Korrektur]** In `Student` gibt es die Methode `abbuchen(double betrag)`. Sie prüft den Betrag **nicht** auf Plausibilität. Welches unerwünschte Verhalten ist dadurch möglich, und wie würdest du es absichern? (Es muss nichts implementiert werden – nur begründen.)

> Antwort: Wir sollten sicherstellen, dass durch das Abbuchen das Guthaben nicht negativ wird. Außerdem sollte geprüft werden, dass der Betrag positiv ist - sonst wird aus dem Abbuchen ein Aufladen.

**1.5 [Wissen]** Wenn man in `App` zwei Studenten per Copy-Konstruktor erzeugt und beim zweiten den Namen ändert – ändert sich dadurch der erste? Begründe mit dem Aufbau des Copy-Konstruktors.

> Antwort: Der erste Namen ändert sich nicht. String ist zwar ein Objekt. Es verhält sich in diesem Beispiel aber ähnlich wie primitve Datentypen: Es wird eine echte Kopie erzeugt (weil Strings immutable sind, also nachträglich nicht verändert werden können). Bei anderen Objekten würden sich bei dieser Art des Kopierens auch die Eigenschaften des ersten Objektes ändern (es werden Referenzen kopiert - keine Objekte). Wir nennen diese Art des Kopierens daher auch "shallow copy".

---

## Thema 2 – Ein-/Ausgabe & Formatierung
*Klassen: `modell/Gericht.java`, `modell/Mensa.java`*

**2.1 [Wissen]** In `Gericht.toString()` wird `String.format("%.2f", berechnePreis())` verwendet. Was bewirkt `%.2f`, und wie sähe die Ausgabe für den Preis `4.3` aus?

> Antwort:

**2.2 [Wissen]** `Mensa.speisekarteAusgeben()` nutzt `System.out.println(g + " | " + g.beschreibung())`. Warum wird hier automatisch `toString()` von `g` aufgerufen, obwohl es nicht explizit dasteht?

> Antwort: 

**2.3 [Wissen]** Angenommen, die Speisekarte soll in eine Datei `speisekarte.txt` geschrieben werden (z. B. mit `PrintWriter`). Welche checked Exception müsste man dabei behandeln, und welche zwei Wege gibt es laut Vorlesung, damit umzugehen?

> Antwort:

**2.4 [Wissen]** Warum würde man einen `PrintWriter` nach dem Schreiben mit `close()` schließen? Was kann passieren, wenn man es vergisst?

> Antwort:

**2.5 [Korrektur]** Die Methode `Gericht.toString()` ruft `berechnePreis()` auf. Wenn `berechnePreis()` (etwa durch einen Fehler in einer Unterklasse) eine Endlosrekursion auslösen würde, welche Auswirkung hätte das auf jede `println`-Ausgabe eines Gerichts? Welcher Laufzeitfehler träte auf?

> Antwort:

---

## Thema 3 – Lineare Listen, Vektoren & Generics
*Klassen: `listen/Knoten.java`, `listen/VerketteteListe.java`, `modell/Bestellung.java`*

**3.1 [Lücke]** In `VerketteteListe.anhaengen(E wert)` fehlt im `else`-Zweig genau eine Zeile (markiert mit `// TODO (Thema Listen)`). Ergänze sie, sodass `neu` korrekt ans Ende gehängt wird.

> Antwort (die fehlende Zeile):

**3.2 [Wissen]** `VerketteteListe<E>` ist generisch. In `Bestellung` wird sie als `VerketteteListe<Gericht>` verwendet. Welchen Vorteil bringt der Typparameter gegenüber einer Liste, die nur `Object` speichert?

> Antwort:

**3.3 [Wissen]** In `anhaengen` läuft die Schleife `while (p.next != null)`. Was stellt `p` am Ende der Schleife dar, und warum genau dieses Element?

> Antwort:

**3.4 [Korrektur]** `VerketteteListe.get(index)` läuft die Liste bei **jedem** Aufruf von vorne durch. In `Bestellung.gesamtpreis()` wird `get(i)` in einer Schleife über alle Elemente aufgerufen. Welche Konsequenz hat das für die Laufzeit bei großen Listen? (Kein Code nötig – Effekt benennen.)

> Antwort:

**3.5 [Wissen]** `Bestellung` speichert `VerketteteListe<Gericht>`, fügt aber `Hauptgericht`, `Beilage` und `Aktionsgericht` hinzu. Warum ist das ohne Cast möglich?

> Antwort:

---

## Thema 4 – Rekursion, Suchbäume & Sortieren
*Klasse: `modell/Mensa.java` (`summeAb`, `nachPreisSortieren`)*

**4.1 [Lücke]** In `Mensa.summeAb(int index)` ist die rechte Seite der `return`-Zeile unvollständig (`// TODO (Thema Rekursion)`). Ergänze sie so, dass der Preis des aktuellen Gerichts plus die Summe des Rests zurückgegeben wird.

> Antwort (die vollständige return-Zeile): return speisekarte.get(index).berechnePreis() + summeAb(index + 1);

**4.2 [Wissen]** Was ist der **Basisfall** von `summeAb`, und warum würde ohne ihn ein Laufzeitfehler entstehen? Wie heißt dieser Fehler?

> Antwort: "Basisfall" = Rekursionsanker (= Abbruchbedingung), ohne ihn würde es zu einer Endlosschleife kommen und ein Index out of Bounds fehler würde entstehen, sobald der Index >= der size des Array ist

**4.3 [Wissen]** `nachPreisSortieren()` ist ein Bubble-Sort mit zwei verschachtelten Schleifen. Erkläre, was die innere Schleife in einem Durchlauf bewirkt (Stichwort: „das größte Element wandert nach hinten").

> Antwort: Das größte Element aus dem bisher noch unsortierten Bereich wird an das Ende der Liste verschoben. 

**4.4 [Wissen]** Warum läuft die innere Schleife nur bis `speisekarte.size() - 1 - i` und nicht bis zum Ende? Was wäre der Effekt, wenn man das `- i` weglässt?

> Antwort: Das " - i" verhindert, dass wir erneut durch den bereits sortierten Bereich laufen (am Ende der Liste). Denn am Ende der Liste sind die Elemente bereits sortiert. Wenn wir bis zum Ende laufen würden, gäbe es noch ein paar unnötige Vergleiche. Der Algorithmus würde weiterhin funktionieren, wäre aber nicht ganz so effizient.

**4.5 [Korrektur]** Der Bubble-Sort sortiert nach `berechnePreis()`. Da `berechnePreis()` bei `Aktionsgericht` den Rabatt abzieht, wird nach dem **Endpreis** sortiert, nicht nach dem `grundpreis`. Ist das ein Fehler oder gewolltes Verhalten? Begründe anhand der Aufgabenstellung „Speisekarte aufsteigend nach Preis".

> Antwort: Die Sortierung macht Sinn, da die Kundinnen und Kunden sich in der Regel am tatsächlichen Preis orientieren - und nicht nach dem Grundpreis.

---

## Thema 5 – GUI-Programmierung (Swing, Komposition)
*Klasse: `gui/SpeisekarteFenster.java`*

**5.1 [Lücke]** In `SpeisekarteFenster` ist die `for`-Schleife über die Speisekarte leer (`// TODO (Thema GUI)`). Ergänze sie so, dass pro Gericht ein `JLabel` mit `g.toString()` erstellt und dem `panel` hinzugefügt wird.

> Antwort (die fehlenden Zeilen):

**5.2 [Wissen]** `SpeisekarteFenster` erbt **nicht** von `JFrame`, sondern hält ein `JFrame` als Feld. Wie heißt dieses Prinzip, und warum wird es im Kurs gegenüber `extends JFrame` bevorzugt?

> Antwort: Wir erben in unserem GUI-Beispiel nicht von den Swing-Klassen, sondern benutzen diese einfach. Statt "is a" haben wir also eine "uses"-Beziehung. Unsere eigenes Fenster ist also kein JFrame, sondern es benutzt einen JFrame, um sich selbst zu rendern. Das gibt uns mehr Flexibilität bei der Ausgestaltung der Methoden - und wir können auch die Menge der verfügbaren Methoden einschränken. Bei Vererbung wären ja immer alle Methoden aus JFrame verfügbar, bei einer eigenen Klasse ist das nicht der Fall.

**5.3 [Wissen]** Das Panel nutzt `new GridLayout(0, 1, 5, 5)`. Was bedeutet die `0` als erstes Argument, und wie werden die Gerichte dadurch angeordnet?

> Antwort:

**5.4 [Wissen]** Warum ruft `App.gui()` am Ende `fenster.anzeigen()` (also `setVisible(true)`) auf? Was würde man ohne diesen Aufruf sehen?

> Antwort:

**5.5 [Korrektur]** Das Fenster zeigt die Speisekarte zum Zeitpunkt der Konstruktion an. Wenn man **nach** dem Erzeugen des Fensters ein Gericht zur übergebenen Liste hinzufügt, erscheint es nicht im Fenster. Woran liegt das? (Stichwort: wann werden die JLabels erzeugt?)

> Antwort:

---

## Thema 6 – Vererbung & Polymorphie
*Klassen: `modell/Gericht.java`, `Hauptgericht`, `Beilage`, `Aktionsgericht`*

**6.1 [Lücke]** In `Beilage.beschreibung()` ist der Rumpf unvollständig (`// TODO (Thema Vererbung)`). Ergänze ihn so, dass `"Beilage: <name>"` zurückgegeben wird.

> Antwort (die return-Zeile): return "Beilage: " + name;

**6.2 [Wissen]** `Gericht` ist `abstract` und hat die abstrakten Methoden `berechnePreis()` und `beschreibung()`. Was bedeutet das für (a) `new Gericht(...)` und (b) jede konkrete Unterklasse?

> Antwort: (a) ist nicht möglich. Der Befehl führt zu einem Compilerfehler. Von abstrakten Klassen können keine Objekte erstellt werden. (b) Konkrete Unterklassen müssen die abstrakten Methoden berechnePreis() und beschreibung() implementieren.

**6.3 [Wissen]** `Aktionsgericht.berechnePreis()` ruft `super.berechnePreis()` auf. Welche Methode wird damit ausgeführt, und warum nutzt man `super` statt den Preis komplett neu zu berechnen?

> Antwort: Es wird berechnePreis aus der Klasse Hauptgericht aufgerufen. Führt dazu, dass der Preis von Aktionsgerichten sich am Preis der Hauptgerichte orientiert, also vegetarische Gerichte 0,50 € günstiger sind. Dadurch vermeiden wir erstes Codeduplizierung und zweitens auch Inkonsistenzen (wenn wir den duplizierten Code später einmal ändern).

**6.4 [Wissen]** In `App.gerichteUndPolymorphie()` stehen alle Objekte in `ArrayList<Gericht>`, und `g.berechnePreis()` liefert je nach echtem Typ ein anderes Ergebnis. Wie heißt dieses Prinzip, und warum braucht man keine `instanceof`-Fallunterscheidung?

> Antwort: Wir nennen das Polymorphie oder dynamisches Binden. BerechnePreis ist eine Methode aus Gericht, die Methode kann also für alle Gerichte ausgeführt werden. Je nach Typ wird die Methode aus der jeweiligen Unterklasse verwendet. Nicht der Typ der Referenz ArrayList<Gericht> bestimmt, welche Methode aufgerufen wird, sondern der Typ des referenzieren Objekts.

**6.5 [Korrektur]** `Beilage.beschreibung()` ist `final`. Angenommen, jemand schreibt `class Tagessuppe extends Beilage` und versucht, `beschreibung()` zu überschreiben. Was passiert, und auf welcher Ebene (Compiler/Laufzeit) wird das gemeldet?

> Antwort: Finalen Methoden dürfen in Unterklassen nicht überschrieben werden. Der Compiler erkennt das, das Programm lässt sich nicht compilieren (und nicht ausführen).

---

## Thema 7 – Interfaces
*Klassen: `modell/Rabattfaehig.java`, `Aktionsgericht`, `App.interfacesUndCasting()`*

**7.1 [Wissen]** `Rabattfaehig` ist ein Interface mit nur einer Methode. `Aktionsgericht` erbt von `Hauptgericht` **und** implementiert `Rabattfaehig`. Wie kann eine Klasse gleichzeitig erben und ein Interface implementieren?

> Antwort:

**7.2 [Wissen]** In `interfacesUndCasting()` wird `if (g instanceof Rabattfaehig)` geprüft und dann nach `Rabattfaehig` gecastet. Warum besteht ein `Aktionsgericht`-Objekt diese Prüfung, ein einfaches `Hauptgericht` aber nicht?

> Antwort:

**7.3 [Wissen]** Nenne zwei Unterschiede zwischen dem Interface `Rabattfaehig` und der abstrakten Klasse `Gericht`.

> Antwort:

**7.4 [Korrektur]** Würde man `Beilage` ebenfalls `implements Rabattfaehig` geben, aber `rabattInEuro()` **nicht** implementieren – was meldet der Compiler? Begründe.

> Antwort:

**7.5 [Wissen]** Warum ist es sinnvoll, „rabattfähig sein" als eigenes Interface zu modellieren, statt eine Methode `rabattInEuro()` direkt in `Gericht` zu packen? (Stichwort: nicht jedes Gericht ist rabattfähig.)

> Antwort:

---

## Thema 8 – Pakete & Exceptions
*Klassen: `ausnahmen/*`, `modell/Mensa.abrechnen`, `App.bestellungUndExceptions()`*

**8.1 [Lücke]** In `GuthabenAusnahme.getFehlbetrag()` fehlt die Berechnung (`// TODO (Thema Exceptions)`). Ergänze sie so, dass der fehlende Betrag (`benoetigt - vorhanden`) zurückgegeben wird.

> Antwort (die return-Zeile): return benoetigt - vorhanden;

**8.2 [Lücke]** In `Mensa.abrechnen(...)` fehlt in „Prüfung 2" das Werfen der Ausnahme (`// TODO (Thema Exceptions)`). Ergänze die Zeile, die eine `GuthabenAusnahme` mit Guthaben und Preis wirft.

> Antwort (die fehlende Zeile): throw new GuthabenAusnahme(kunde.getGuthaben(), preis);

**8.3 [Wissen]** Die Klassen liegen in verschiedenen Paketen (`modell`, `ausnahmen`). Warum muss `Mensa.java` die Ausnahmen mit `import de.thi.mensa.ausnahmen.…` einbinden, `Hauptgericht` und `Gericht` (gleiches Paket `modell`) dagegen nicht?

> Antwort: Um die Ausnahmen in einem anderen Paket verwenden zu können muss man das ausnahmenPaket in das andere importieren. Dadurch hat man Zugriff auf Klassen des importierten Paketes und auch auf deren Methoden. Gericht und Hauptgericht muss nicht importiert werden, da sich diese genau im selben Paket wie Mensa befinden.

**8.4 [Korrektur]** In `App.bestellungUndExceptions()` stehen die `catch`-Blöcke in der Reihenfolge: `GerichtAusverkauftAusnahme`, `GuthabenAusnahme`, `MensaAusnahme`. Was würde der Compiler melden, wenn man `catch (MensaAusnahme e)` **an den Anfang** stellt? Begründe mit der Vererbungshierarchie der Ausnahmen.

> Antwort: Da 'GerichtAusverkauftAusnahme' oder 'GuthabenAusnahme' eine Unterklasse von 'MensaAusnahme' sind würde immer direkt die 'MensaAusnahme' gecatched werden (eine GerichtAusverkauftAusnahme oder GuthabenAusnahme sind MensaAusnahmen) und die anderen beiden Ausnahmen könnten nicht erreicht werden. 
Bei der falschen Reihenfolge würde der Compiler melden, dass es sich bei den spezifischeren Ausnahmebehandlungen um "nicht erreichbare Codebereiche" handelt.

**8.5 [Wissen]** `abrechnen` ist mit `throws MensaAusnahme` deklariert, obwohl es konkret `GerichtAusverkauftAusnahme` und `GuthabenAusnahme` wirft. Warum genügt es, die gemeinsame Oberklasse zu deklarieren?

> Antwort: Weil die Unterklassen auch MensaAusnahmen sind und in dem Statement "throws MensaAusnahme" beinhaltet sind.

---

## Thema 9 – Threads & Nebenläufigkeit
*Klassen: `nebenlaeufig/Kassenstand.java`, `KassenThread.java`, `App.threads()`*

**9.1 [Lücke]** In `KassenThread.run()` ist die Hochzähl-Zeile **nicht** synchronisiert (`// TODO (Thema Threads)`). Ergänze einen `synchronized`-Block auf das gemeinsame Objekt `kasse`, der die Zeile umschließt.

> Antwort (der synchronized-Block):

**9.2 [Wissen]** `Kassenstand.anzahlVerkaufteEssen` ist `volatile`. Was bewirkt `volatile` genau – und warum reicht es **nicht** aus, um `wert = wert + 1` korrekt zu machen?

> Antwort:

**9.3 [Wissen]** In `App.threads()` starten zwei `KassenThread`s mit je 1.000.000 Verkäufen. Ohne Synchronisierung ist das Ergebnis am Ende oft **kleiner** als 2.000.000. Erkläre, wie eine Erhöhung „verloren geht" (lost update).

> Antwort:

**9.4 [Korrektur]** Würde man in `App.threads()` die `k1.join()` / `k2.join()`-Aufrufe weglassen und direkt danach `kasse.anzahlVerkaufteEssen` ausgeben – warum wäre das Ergebnis unzuverlässig, selbst wenn der `synchronized`-Block korrekt ist?

> Antwort:

---

## Hinweise zum Arbeiten mit dem Projekt

- Aktiviere in `App.main()` jeweils die Methode des Themas, das du testen willst (Kommentar entfernen).
- Die **`threads()`**-Methode zeigt die Race Condition nur deutlich, **bevor** du den `synchronized`-Block aus 9.1 ergänzt hast – danach kommt zuverlässig `2000000` heraus.
- Die **`gui()`**-Methode öffnet ein Fenster; sie funktioniert erst, wenn die Lücke in 5.1 gefüllt ist (sonst bleibt das Panel leer).

*Viel Erfolg!*
