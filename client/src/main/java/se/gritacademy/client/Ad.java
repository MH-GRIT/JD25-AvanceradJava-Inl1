package se.gritacademy.client;

/**
 * En annons så som servern skickar den. Fältnamnen motsvarar JSON-formatet i
 * API-kontraktet och får inte ändras.
 *
 * @param price pris i hela kronor
 */
public record Ad(long id, String subject, String description, int price, Seller seller) {
}
