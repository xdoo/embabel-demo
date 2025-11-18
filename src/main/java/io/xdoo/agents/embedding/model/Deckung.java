package io.xdoo.agents.embedding.model;

public record Deckung(
        String deckungs_id,
        String gefahr,
        String bezeichnung,
        Selbstbeteiligung selbstbeteiligung,
        int versicherungssumme_eur
) {}
