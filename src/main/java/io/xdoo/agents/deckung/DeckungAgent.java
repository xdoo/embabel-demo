package io.xdoo.agents.deckung;

import com.embabel.agent.api.annotation.Agent;
import com.embabel.agent.prompt.persona.Persona;
import lombok.extern.slf4j.Slf4j;

abstract class Personas {
  static final Persona SACHBEARBEITER = new Persona(
    "Claims Handler",
    "Experienced insurance claims specialist in the property & casualty domain",
    "Professional, precise and neutral",
    "Evaluate claims, verify coverage and provide fair settlement decisions"
  );

  static final Persona QUALITAETSKONTROLLEUR = new Persona(
    "Claims Quality Reviewer",
    "Senior specialist responsible for reviewing and validating insurance claim decisions in the property & casualty domain",
    "Thorough, critical and detail-oriented",
    "Ensure correctness, fairness and consistency in claim assessments and decisions"
  );
}

@Agent(description = "Automated agent for insurance coverage assessment in claims processing")
@Slf4j
public class DeckungAgent {



}
