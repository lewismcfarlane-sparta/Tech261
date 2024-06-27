package com.sparta.lm;

import java.io.IOException;
import java.util.logging.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomLogFormatter());
        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomLogFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        logger.log(Level.INFO, "this is an info message");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        logger.info("This is an info message");
        logger.warning("This is a WARNING message!");
        logger.fine("This is a fine message");


    }
}
