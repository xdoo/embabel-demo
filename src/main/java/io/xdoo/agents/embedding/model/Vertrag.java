package io.xdoo.agents.embedding.model;

import java.util.List;

public record Vertrag(
        String vertrag_id,
        String produkt,
        String datum,
        String versicherungsschein_nr,
        List<Deckung> deckungen
) {}

