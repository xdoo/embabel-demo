package io.xdoo.agents.deckung.model;

import java.time.LocalDate;
import java.util.List;

public record Vertrag(
  String vertragsnummer,
  String sparte,
  List<Deckung> deckungen,
  LocalDate gueltigVon,
  LocalDate gueltigBis
) {
}
