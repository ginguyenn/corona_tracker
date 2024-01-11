# Hausaufgabe 6

In dieser Hausaufgabe geht es darum eine kleine Web-Anwendung mit dem Spring Framework zu erstellen. 
Die Grundlage für diese Hausaufgabe ist das Spring Boot Tutorial Video von Koushik Kothagal (leitender Entwickler bei LinkedIn): https://youtu.be/8hjNG9GZGnQ (auf Englisch mit leichtem indischen Akzent; im Zweifelsfall gibt es bei Youtube automatisch generierte deutsche Untertitel, die allerdings nicht immer 100% korrekt sind)

## Abgabe

Nehmen Sie das Assignment auf Github Classroom an und wählen Sie Ihren Namen aus der Liste aus.
Dadurch wird ein (dieses) Repository für Sie erstellt. 
Klonen Sie das Repo und pushen Sie Ihre Lösungen in mehreren sinnvoll zusammengefassten Commits (z.B. einer pro Teilaufgabe, es können aber auch gerne mehr sein).
Sie müssen Ihre Lösung bis zum 29. Juni um 23:59 Uhr gepusht haben, alle Tests müssen grün sein, und Sie müssen spätestens in der darauf folgenden von Ihnen belegten Übungsgruppe Ihre Lösung kurz demonstrieren.

## Aufgabenstellung

0.  Akzeptieren Sie die Aufgabe bei Github Classroom und clonen Sie Ihr (weitgehend leeres) Repository.
1.  Beginnen Sie damit das Tutorial durchzugehen, indem Sie den Spring Initializr auf start.spring.io so verwenden, wie im Tutorial dargestellt, allerdings mit folgenden Unterschieden: i. Wählen Sie Gradle statt Maven; ii. Wählen Sie für Spring Boot die Version 2.7.0 und für Java die Version 17 aus; iii. Geben Sie dem Projekt einen eigenen Namen, z.B. htw.berlin.corona-tracker; iv. Entpacken Sie den Inhalt der generierten Zip-Datei so in Ihr Repository Verzeichnis (also 'ha6-...'), dass die Datei `build.gradle` sowie der `src`-Ordner etc. sich auf der obersten Ebene befinden, also dort, wo diese README-Datei liegt, und importieren Sie erst dann das Projekt in IntelliJ.
2.  Testen Sie, ob die generierte Anwendung an sich funktioniert, indem Sie sie entweder von der Kommandozeile mit `./gradlew bootRun` oder von IntelliJ aus starten (dass die Anzeige nicht über 80% hinausgeht ist normal; zum stoppen der Anwendung von der Kommandozeile aus drücken Sie Strg+C bzw. Cmd+C) und dann in Ihrem Web-Browser in der Adresszeile `localhost:8080` eingeben. Sie sollten nun zumindest eine Textseite mit dem Titel 'Whitelabel Error Page' sehen. Ist dies der Fall, erstellen Sie jetzt - also noch bevor Sie irgendwelche eigenen Änderungen am Code vornehmen - einen aussagekräftigen Commit.
3.  Folgen Sie dem Tutorial weiter und erstellen Sie die Model-, View-, und Controller-Dateien wie dort beschrieben. Beachten Sie beim Erstellen des Services, der die Infektionsdaten von Github zieht, dass sich die Adresse dieser Daten geringfügig geändert hat, und zwar zu `https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv`. Testen Sie nun, ob Sie beim erneuten Navigieren zu `localhost:8080` die formatierte Tabelle mit den aktuellsten Infektionszahlen sehen. Wenn ja, erstellen Sie spätestens jetzt wieder einen aussagekräftigen Commit.
4.  Fügen Sie mindestens zwei Unit-Tests hinzu: einen, der die `toString`-Methode der Klasse `LocationStats` testet und daher im Verzeichnis `src/test/java/.../models/` liegen sollte und einen, der das Funktionieren der Methode `fetchVirusData` der Klasse `CoronaVirusDataService` testet, z.B. indem nach dem Aufruf dieser Methode gecheckt wird, welche Länge der Rückgabewert der Methode `getAllStats` hat oder bspw. dass die Rückgabeliste mit einem Eintrag über Afghanistan startet.
5.  (Optional und freiwillig) Implementieren Sie einen zusätzlichen Controller, so dass beim Klicken auf eine der Tabellenüberschriften, also z.B. `Changes since last day`, die Seite neu geladen wird und die Tabelleneinträge anhand dieses Feldes sortiert sind. 
