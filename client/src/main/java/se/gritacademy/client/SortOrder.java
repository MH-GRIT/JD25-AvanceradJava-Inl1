package se.gritacademy.client;

/** Sorteringsordning för VG3. {@link #queryValue()} är värdet på query-parametern sort. */
public enum SortOrder {
    /** Den ordning annonserna skapades, äldst först. */
    CREATED("created"),
    /** Pris, lägst först. */
    PRICE("price");

    private final String queryValue;

    SortOrder(String queryValue) {
        this.queryValue = queryValue;
    }

    public String queryValue() {
        return queryValue;
    }
}
