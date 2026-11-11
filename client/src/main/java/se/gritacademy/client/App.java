package se.gritacademy.client;

/**
 * Startpunkt för klienten.
 *
 * <p>Starta med {@code ./mvnw -q exec:java} (servern på http://localhost:8080) eller
 * ange en annan adress som första argument:
 * {@code ./mvnw -q exec:java -Dexec.args="http://localhost:9090"}.</p>
 */
public class App {

    static final String DEFAULT_BASE_URL = "http://localhost:8080";

    public static void main(String[] args) {
        String baseUrl = args.length > 0 ? args[0] : DEFAULT_BASE_URL;
        AdApi api = new HttpAdApi(baseUrl);

        // TODO: Skapa och starta menyn. Menyn ska ha valen
        //   1. Lista alla annonser
        //   2. Visa annons
        //   3. Skapa annons
        //   4. Ändra pris
        //   5. Radera annons
        //   0. Avsluta
        // och bara använda 'api' för att prata med servern.
        System.out.println("Fulköpings Köp och Sälj – klienten är inte implementerad än (server: " + baseUrl + ")");
    }
}
