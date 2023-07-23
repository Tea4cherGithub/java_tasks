package org.example.compositionagregationoop.refactor;

import java.util.UUID;

/**
 * Идентификатор выданный государством
 */
public class StateIdentifier {

    /**
     * Идентификатор
     */
    private final UUID uuid;

    /**
     * Кем выдан
     */
    private final String whoGetting;

    public StateIdentifier(UUID uuid, String whoGetting) {
        this.uuid = uuid;
        this.whoGetting = whoGetting;
    }
}
