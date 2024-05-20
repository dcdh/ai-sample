package com.damdamdeo;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MyAiServiceTest {
    @Inject
    MyAiService myAiService;

    @Test
    public void shouldWriteAPoemOnQuarkusTopic() {
        final String quarkus = myAiService.writeAPoem("Quarkus", 4);
        Assertions.assertNotNull(quarkus);
    }
}
