package se.gritacademy.client;

/**
 * Det klienten skickar när en ny annons skapas (POST /api/ads). Id sätts av servern.
 *
 * @param price pris i hela kronor
 * @param pin   fyrsiffrig pinkod (VG1), eller null på G-nivå
 */
public record NewAd(String subject, String description, int price, Seller seller, String pin) {
}
