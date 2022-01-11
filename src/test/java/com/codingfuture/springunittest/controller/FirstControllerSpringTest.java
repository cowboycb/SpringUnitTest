package com.codingfuture.springunittest.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FirstControllerSpringTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testFromRepo() throws JSONException {
        String actualJson = restTemplate.getForObject("/from-repo", String.class);
        JSONAssert.assertEquals("[{id: 1}]", actualJson, false);
    }
}