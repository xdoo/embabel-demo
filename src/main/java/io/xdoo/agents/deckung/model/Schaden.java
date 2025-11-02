package io.xdoo.agents.deckung.model;

import java.time.LocalDate;

public record Schaden(
  String schadennummer,
  String vertragsnummer,
  String schadenart,
  LocalDate schadendatum,
  String ort,
  int betrag
) {
}
