package com.codingfuture.springunittest.controller;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


class AssertJTests {

    @Test
    void usingAsserJFunctions(){
        List<Integer> list = Arrays.asList(12, 23, 34);
        assertThat(list)
                .contains(23, 34)
                .hasSize(3)
                .allMatch(x -> x >= 12);
    }
}
