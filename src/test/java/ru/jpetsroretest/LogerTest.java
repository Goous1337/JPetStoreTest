package ru.jpetsroretest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogerTest {

    private static final Logger logger = LoggerFactory.getLogger(LogerTest.class);

    @Test
    public void testLogging() {
        logger.info("Ci cd!");
    }
}
