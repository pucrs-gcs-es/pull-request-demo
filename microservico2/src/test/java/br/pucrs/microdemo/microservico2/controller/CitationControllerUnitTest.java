package br.pucrs.microdemo.microservico2.controller;

import br.pucrs.microdemo.microservico2.business.CitationCollection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CitationControllerUnitTest {

    @Mock
    private CitationCollection citationCollection;

    @InjectMocks
    private CitationController citationController;

    @Test
    void testGetCitation() {
        String mockCitation = "I didn't come this far. to only come this far.";
        when(citationCollection.getCitation()).thenReturn(mockCitation);

        String result = citationController.getCitation();
        assertEquals(mockCitation, result);
    }
}
