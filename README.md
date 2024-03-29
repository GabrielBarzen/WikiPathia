# WikiPathia
## Api
### Dokumentation
- https://app.swaggerhub.com/apis-docs/TobiasSvenssonDev/WikiPathia/2.0.0
### Tjänster:
- https://developer.trafiklab.se/projekt/wikipathia
- https://www.mediawiki.org/wiki/API:Main_page

## Körningsinstruktion
### Förutsättningar:
- Java 17
- Maven 3.8.4

### Förinstallation
#### Windows
Maven:
- https://mkyong.com/maven/how-to-install-maven-in-windows/

Java:
- https://docs.oracle.com/en/java/javase/17/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA
#### Linux

##### <u> Ubuntu </u>
Maven:
- https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/

Java:
- https://techviewleo.com/install-java-openjdk-on-ubuntu-linux/
##### <u> Arch-based </u>
Maven:
``` zsh
sudo pacman -S maven
```
Java:
``` zsh
sudo pacman -S jre-openjdk
```

## Instruktioner
### linux:
#### Steg 1: klona projektet
Kör nedstående kommandot i terminalemulator :
```zsh
mkdir wikipathia && git clone https://github.com/GabrielModin/WikiPathia/ ./wikipathia && cd wikipathia/application/
```
#### Steg 2: Hämta dependencies från pom.xml 
Kör nedstående kommandot i terminalemulator :
```zsh
mvn dependency:resolve
```
#### Steg 3: kör applikationen 
Kör nedstående kommandot i terminalemulator :
```zsh
mvn spring-boot:run
```

### Windows:
#### Steg 1: klona projektet
Kör nedstående kommandot i terminalemulator :
```zsh
mkdir wikipathia | git clone https://github.com/GabrielModin/WikiPathia/ ./wikipathia
```
#### Steg 2: Navigera till katalogen application
Kör nedstående kommandot i terminalemulator :
```zsh
cd wikipathia/application/
```
#### Steg 3: Hämta dependencies från pom.xml 
Kör nedstående kommandot i terminalemulator :
```zsh
mvn dependency:resolve
```
#### Steg 4: kör applikationen 
Kör nedstående kommandot i terminalemulator :
```zsh
mvn spring-boot:run
```
##### Anteckningar
- Servern körs på port 8080
- För att komma till applikationens huvudsida skriv http://localhost:8080/ i webbläsarens adressfält

