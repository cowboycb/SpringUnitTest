package com.codingfuture.springunittest.controller;

import com.codingfuture.springunittest.model.FirstModel;
import com.codingfuture.springunittest.service.FirstService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(FirstController.class)
class FirstControllerSpringMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FirstService firstService;

    @Test
    void when_requestToFirstMethod_returnMessage() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/first");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome First Method"));
    }

    @Test
    void when_requestToFirstService_returnModel() throws Exception {
        when(firstService.fetchFromService())
                .thenReturn(FirstModel.builder()
                        .id(1)
                        .name("Model")
                        .address("location")
                        .build());
        RequestBuilder request = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/first-service");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Model\",\"address\":\"location\"}"));
    }
}