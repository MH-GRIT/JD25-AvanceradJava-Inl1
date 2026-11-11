package se.gritacademy.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/** Exempel på ett JUnit 5-test. Lägg gärna till egna tester här. */
class HttpAdApiTest {

    @Test
    void httpAdApiImplementsAdApi() {
        assertInstanceOf(AdApi.class, new HttpAdApi("http://localhost:8080"));
    }

    @Test
    void sortOrderUsesQueryValuesFromTheApiContract() {
        assertEquals("created", SortOrder.CREATED.queryValue());
        assertEquals("price", SortOrder.PRICE.queryValue());
    }
}
