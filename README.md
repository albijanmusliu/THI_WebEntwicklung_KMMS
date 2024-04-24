# THI_WebEntwicklung_KMMS

## Stiehl Anforderungen an unser Projekt
- Spiele anlegen, ändern, löschen
- Vereinbilder hochladen
- Vereine erstellen über Admin  (als Favoriten)
- Peronalisierte Filter (Nur Deutschland Spiele)
- Spiele anlegen kann (User muss aufjedenfall irgendwas in der Seite eintragen können)
- Registierungen (User-basiert)

### Frontend
- HTML
- CSS
- JavaScript (ohne Bibliotheken)

### Backend
- Java mit Servlets und JSP

### IDE
- Eclipse

## Funktionalitäten
1. **Anzeigen von Spielen und Ergebnissen**: Benutzer können Spiele und ihre Ergebnisse anzeigen.
2. **Hinzufügen neuer Spiele**: Benutzer können neue Spiele hinzufügen.
3. **Aktualisieren von Ergebnissen**: Benutzer können Ergebnisse aktualisieren.
4. **Löschen von Spielen**: Benutzer können Spiele löschen.

### 1. MVC-Pattern
- *Model*: Java Beans für die Datenmodellierung (z.B. Fußballergebnis)
- *View*: JSP-Seiten für die Darstellung
- *Controller*: Servlets für die Logik und den Datenzugriff

### 2. Ajax und SPA
- Implementiere Ajax-Anfragen, um Daten vom Server zu lesen/schreiben.
- Zeige die Daten in einer SPA an, die ohne Seitenneuladen auskommt.

### 3. Formatierung mit CSS
- Verwende CSS für das Layout und die Formatierung der Anwendung.
- Achte darauf, dass die Anwendung auf verschiedenen Bildschirmgrößen (mindestens 1280 x 720 bis 1920 x 1080 Pixel) gut bedienbar ist.

### 4. JavaScript
- Verwende JavaScript für die Client-seitige Logik und die Interaktion mit dem Server.
- Implementiere eine Meldung, die den Benutzer auffordert, JavaScript zu aktivieren, wenn es deaktiviert ist.
- Vermeide Debug-Alert-Boxen in der finalen Version.

### 5. Session-Management
- Nutze das automatische Session-Management von Servlets/JSP.
- Erstelle mehrere HTML- bzw. JSP-Seiten, die Daten über eine Session austauschen.


## Implementierung

1. **Backend-Entwicklung**
   - Erstellen von Servlets für CRUD-Operationen (Hinzufügen, Lesen, Aktualisieren, Löschen) von Fußballspielen und Ergebnissen.
   - Definition von Java Beans für Fußballergebnisse und das Session-Management.
   
2. **Frontend-Entwicklung**
   - Erstellen von JSP-Seiten zur Anzeige von Spielen und Ergebnissen, sowie einer Admin-Oberfläche.
   - Gestaltung der Anwendung mit CSS für ein ansprechendes und benutzerfreundliches Design.
   - Implementierung von JavaScript für die client-seitige Logik und Ajax-Anfragen.
   
3. **SPA und Ajax**
   - Verwendung von JavaScript und Ajax, um Spiele und Ergebnisse dynamisch anzuzeigen und zu bearbeiten.
   
4. **Session-Management**
   - Nutzung der Session, um Benutzerinformationen und bearbeitete Spiele zwischen verschiedenen Seiten auszutauschen.
   
5. **Testen und Debuggen**
   - Gründliche Überprüfung der Anwendung, um sicherzustellen, dass alle Funktionen korrekt funktionieren.
   - Entfernung von Debug-Alert-Boxen und Optimierung des Codes für eine reibungslose Benutzererfahrung.
   
## Dokumentation
- Erstellung einer detaillierten Dokumentation, die die Architektur, Funktionsweise und Implementierung der Anwendung erklärt.


## Benutzung
1. Klone das Repository.
2. Öffne das Projekt in Eclipse.
3. Starte den Server und öffne die Anwendung im Webbrowser.

## Autoren

- Albijan Musliu
- Tim Martin
- Tim Kreitmeier
- Tobias Steinberger
