package br.pucrs.microdemo.microservico2.controller;

import br.pucrs.microdemo.microservico2.business.CitationCollection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CitationController.class)
class CitationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CitationCollection citationCollection;

    @Test
    void testGetCitation() throws Exception {
        String mockCitation = "Vulnerability sounds like faith and looks like courage.";
        when(citationCollection.getCitation()).thenReturn(mockCitation);

        mockMvc.perform(get("/citation")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(mockCitation));
    }
}
