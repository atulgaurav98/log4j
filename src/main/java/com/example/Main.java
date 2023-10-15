package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        // Create a logger using SLF4J
        Logger logger = LoggerFactory.getLogger(Main.class);

        // Log messages
        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message.");
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("This is an ERROR message.");

    }
}
