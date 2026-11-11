package se.gritacademy.client;

import java.util.List;
import java.util.Optional;

/**
 * Klientens koppling till servern. Gränssnittet är givet och får inte ändras.
 *
 * <p>Implementera det i {@link HttpAdApi}. Menyn i klienten ska bara prata med
 * servern via detta gränssnitt. Varje metod gör minst ett HTTP-anrop, och
 * klienten sparar ingen data mellan anropen.</p>
 */
public interface AdApi {

    /** GET /api/ads – alla annonser i serverns standardordning. */
    List<Ad> listAds();

    /** VG3: GET /api/ads?sort=created eller ?sort=price. */
    List<Ad> listAds(SortOrder order);

    /** GET /api/ads/{id} – tom Optional om servern svarar 404. */
    Optional<Ad> getAd(long id);

    /** POST /api/ads – returnerar annonsen som servern skapade (med id). */
    Ad createAd(NewAd ad);

    /**
     * Ändrar priset på en annons: GET /api/ads/{id} och sedan PUT /api/ads/{id}
     * med hela annonsen och det nya priset.
     *
     * @param pin pinkod som skickas i headern X-Pin (VG1), eller null på G-nivå
     * @return true om servern svarade 200, false vid 404 eller 403
     */
    boolean updatePrice(long id, int price, String pin);

    /**
     * DELETE /api/ads/{id}.
     *
     * @param pin pinkod som skickas i headern X-Pin (VG1), eller null på G-nivå
     * @return true om servern svarade 204, false vid 404 eller 403
     */
    boolean deleteAd(long id, String pin);
}
