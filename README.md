# WikiPathia
##Api
###Api tjänster:
- https://developer.trafiklab.se/projekt/wikipathia
- https://www.mediawiki.org/wiki/API:Main_page

## Körningsinstruktion
### Förutsättningar:
- Java 17
- Maven 3.8.4

### Instruktioner linux
#### Steg 1: klona projektet
Kör nedståande kommandot i terminalemulator :
```zsh
mkdir wikipathia & git clone https://github.com/GabrielModin/WikiPathia/ ./wikipathia
```
#### Steg 2: Navigera till katalogen application
Kör nedståande kommandot i terminalemulator :
```zsh
cd wikipathia/application/
```
#### Steg 3: Hämta dependencies från pom.xml 
Kör nedståande kommandot i terminalemulator :
```zsh
mvn dependency:resolve
```
#### Steg 4: kör applikationen 
Kör nedståande kommandot i terminalemulator :
```zsh
mvn spring-boot:run
```
##### Anteckningar
- Servern körs på port 8080
- För att komma till applikationens huvudsida skriv http://localhost:8080/ i webbläsarens adressfält
