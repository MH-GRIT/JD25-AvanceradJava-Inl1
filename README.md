# Fulköpings Köp och Sälj

> Ersätt texten i varje avsnitt nedan med din egen. Rubrikerna ska finnas kvar.

## Projektets mål och funktionalitet

_Beskriv kort vad systemet gör, vilka delar det består av och vilka funktioner som finns.
Ange om du har gjort VG-delarna (VG1 pinkod, VG2 JSON-fil, VG3 sortering)._

## Krav

- Java 25 (JDK)
- Ingen egen Maven-installation behövs, båda projekten har Maven Wrapper (`mvnw`)

## Starta servern

```bash
cd server
./mvnw spring-boot:run
```

Servern startar på http://localhost:8080.

## Starta klienten

Starta servern först, och sedan i ett nytt terminalfönster:

```bash
cd client
./mvnw -q compile exec:java
```

_Beskriv kort hur menyn används._

## Exempel på API-anrop

_Visa minst tre anrop med curl och vad servern svarar. Exempel:_

```bash
# Lista alla annonser
curl -i http://localhost:8080/api/ads
```

```bash
# Skapa en annons
curl -i -X POST http://localhost:8080/api/ads \
  -H "Content-Type: application/json" \
  -d '{"subject":"Barncykel","description":"Välanvänd men hel.","price":300,"seller":{"name":"Anna","email":"anna@example.com","phone":null}}'
```
