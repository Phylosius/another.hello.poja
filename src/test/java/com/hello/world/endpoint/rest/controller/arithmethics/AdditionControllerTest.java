package com.hello.world.endpoint.rest.controller.arithmethics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {

    final AdditionController subject =  new AdditionController();

    @Test
    void addition() {
        assertEquals(4_000_000_000L, subject.addition(3_000_000_000L, 1_000_000_000L));
    }
}