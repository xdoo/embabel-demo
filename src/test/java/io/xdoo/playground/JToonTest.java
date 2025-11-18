package io.xdoo.playground;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.felipestanzani.jtoon.JToon;
import io.xdoo.agents.embedding.model.Vertrag;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class JToonTest {

    @Test
    public void testJToon() throws JsonProcessingException {
        ObjectMapper  mapper = new ObjectMapper();
        Vertrag vertrag = mapper.readValue(sampleContractJson(), Vertrag.class);
        log.info("JToon vertrag: {}", JToon.encode(vertrag));
    }

    private String sampleContractJson() {
        return "{\n" +
                "  \"vertrag_id\": \"VGB-2025-987654\",\n" +
                "  \"produkt\": \"Wohngebäudeversicherung\",\n" +
                "  \"datum\": \"2022-02-01\",\n" +
                "  \"versicherungsschein_nr\": \"VGB-123456789\",\n" +
                "  \"deckungen\": [\n" +
                "    {\n" +
                "      \"deckungs_id\": \"1001\",\n" +
                "      \"gefahr\": \"Feuer\",\n" +
                "      \"bezeichnung\": \"Brand, Blitzschlag, Explosion\",\n" +
                "      \"selbstbeteiligung\": {\n" +
                "        \"typ\": \"feste_sb\",\n" +
                "        \"betrag_eur\": 300\n" +
                "      },\n" +
                "      \"versicherungssumme_eur\": 462500\n" +
                "    },\n" +
                "    {\n" +
                "      \"deckungs_id\": \"2001\",\n" +
                "      \"gefahr\": \"Leitungswasser\",\n" +
                "      \"bezeichnung\": \"Rohrbruch, Frostschäden an Leitungen\",\n" +
                "      \"selbstbeteiligung\": {\n" +
                "        \"typ\": \"feste_sb\",\n" +
                "        \"betrag_eur\": 500\n" +
                "      },\n" +
                "      \"versicherungssumme_eur\": 462500\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

}
