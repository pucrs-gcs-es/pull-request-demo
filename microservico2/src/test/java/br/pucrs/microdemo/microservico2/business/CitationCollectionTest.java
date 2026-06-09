package br.pucrs.microdemo.microservico2.business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Arrays;

class CitationCollectionTest {

    @Test
    void testGetCitationReturnsValidCitation() {
        CitationCollection cc = new CitationCollection();
        String citation = cc.getCitation();
        assertNotNull(citation);

        List<String> validCitations = Arrays.asList(
            "Don't hold onto things. that require a tight grip.",
            "I didn't come this far. to only come this far.",
            "Vulnerability sounds like faith and looks like courage.",
            "Each time you break your own boundaries to ensure that someone else likes you, you like yourself a little less.",
            "There is nothing stronger than a broken person who has rebuilt him/herself."
        );

        assertTrue(validCitations.contains(citation), "Returned citation should be one of the predefined quotes");
    }
}
