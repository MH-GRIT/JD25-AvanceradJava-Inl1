package se.gritacademy.client;

import java.util.List;
import java.util.Optional;

/**
 * Implementation av {@link AdApi} som anropar servern över HTTP.
 *
 * <p>Klassnamnet och konstruktorn är givna och får inte ändras. Använd
 * java.net.http.HttpClient för anropen och Jackson (ObjectMapper) för JSON.</p>
 */
public class HttpAdApi implements AdApi {

    private final String baseUrl;

    /** @param baseUrl serverns adress, till exempel http://localhost:8080 */
    public HttpAdApi(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public List<Ad> listAds() {
        throw new UnsupportedOperationException("TODO: implementera");
    }

    @Override
    public List<Ad> listAds(SortOrder order) {
        throw new UnsupportedOperationException("TODO: implementera (VG3)");
    }

    @Override
    public Optional<Ad> getAd(long id) {
        throw new UnsupportedOperationException("TODO: implementera");
    }

    @Override
    public Ad createAd(NewAd ad) {
        throw new UnsupportedOperationException("TODO: implementera");
    }

    @Override
    public boolean updatePrice(long id, int price, String pin) {
        throw new UnsupportedOperationException("TODO: implementera");
    }

    @Override
    public boolean deleteAd(long id, String pin) {
        throw new UnsupportedOperationException("TODO: implementera");
    }
}
