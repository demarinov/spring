package com.dido.shipping.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AddressControllerMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMinAddressDistanceOkTest() throws Exception {
        this.mockMvc.perform(get("/address/70785")).andDo(print()).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().
                        string(Matchers.containsString("Shortest distance shipping address zip code: 70811")));
    }
}
