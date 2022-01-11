package com.codingfuture.springunittest.controller;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestTests {

    @Test
    void usingHamcrestFunctions(){
        List<Integer> list = Arrays.asList(12, 23, 34);
        assertThat(list, CoreMatchers.everyItem(Matchers.greaterThan(11)));
    }
}
