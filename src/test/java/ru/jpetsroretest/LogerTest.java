package ru.jpetsroretest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogerTest {

    public static final Logger logger = LoggerFactory.getLogger(LogerTest.class);

    @Disabled
    public void testLoggerInfo() {
        logger.info("Сообщение уровня info");
    }
    @Disabled
    public void testLoggerDebug() {
        logger.debug("Сообщение уровня debug");
    }
    @Disabled
    public void testLoggerError() {
        logger.error("Сообщение уровня error");
    }
}
