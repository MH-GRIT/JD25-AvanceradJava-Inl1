package se.gritacademy.client;

/**
 * Säljaren av en annons. Namn krävs, och minst en av email och phone ska vara
 * ifylld (den andra får vara null).
 */
public record Seller(String name, String email, String phone) {
}
